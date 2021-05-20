package oop.flexible;

/* 관리자 클래스 */
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
		salary += 20; // 20만원을 추가로 받는다.
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return (super.getInfo() +"부서: "+ this.deptName);
		
	}
	//상속받은 메서드가 아니고, 자식클래스 단독으로 가지고 있는 메서드이다.
	public String getDeptName() {
		return deptName;
	}


}
