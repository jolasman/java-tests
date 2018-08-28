package abstract_examples;

public abstract class Employee {
	protected int id;
	protected String name;
	protected double salary;
	
	
	public Employee(){
		
	}
	
	//the subclasses that extend this class needs to declare and specify what this method does, otherwise the program does not compile.
	public abstract double getSalary();
	
	
	// basic salary for everyone
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	
	public String getInfo(){
		return this.id + " - " + this.name + " - "+ getSalary();
	}

}
