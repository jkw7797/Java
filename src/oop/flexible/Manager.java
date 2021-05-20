package oop.flexible;

/* ������ Ŭ���� */
public class Manager extends Employee {
	private String deptName;
	
	public Manager(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
		super(name, salary);
	}
	public Manager(String name, double salary, String deptName) {
		this(name,salary);
		this.deptName= deptName;
	}
		
	public void manageSalary(double rate) {
		salary = salary + (salary * (rate / 100));
		salary += 20; // 20������ �߰��� �޴´�.
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return (super.getInfo() +"�μ�: "+ this.deptName);
		
	}
	//��ӹ��� �޼��尡 �ƴϰ�, �ڽ�Ŭ���� �ܵ����� ������ �ִ� �޼����̴�.
	public String getDeptName() {
		return deptName;
	}


}
