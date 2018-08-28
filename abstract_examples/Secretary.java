package abstract_examples;

public class Secretary extends Employee {

	public Secretary(){

	}

	public Secretary(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public double getSalary(){
		return this.salary;
	}


}
