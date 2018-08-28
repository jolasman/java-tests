package abstract_examples;

import interfaces_examples.Authentication;

public class Director extends Employee implements Authentication{

	protected String key_number;

	public Director(){

	}

	public Director(int id, String name, double salary, String key_number){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.key_number = key_number;

	}

	//changing the salary with a bonus, only for the Directors
	@Override
	public double getSalary(){
		return Math.round(this.salary * 1.1);
	}


	public String getInfo(){
		// The super returns the superclass method with the same name. We can update the info with more specific instance variables of the subclass.
		String basic_information = super.getInfo();
		return basic_information + " - " + this.key_number;
	}

	@Override
	public boolean authentication(String key_number) {
		if(!(key_number.equals(this.key_number)) ){
			System.out.println("Director " + this.name + "  cannot go through! Needs a key different from null!");
			return false;
		}
		else{
			System.out.println("Director " + this.name + " can go through!");
			return true;
		}
	}



}
