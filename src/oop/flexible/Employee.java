package oop.flexible;

public abstract class Employee {

	protected String name;
	protected double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Emloyee 생성자 호출됨");
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}
	public String getInfo() {
		return ("이름: " + getName() +"월급: " +  getSalary());
	}
	
	public abstract void manageSalary(double rate);

}