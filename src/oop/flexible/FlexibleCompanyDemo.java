package oop.flexible;

public class FlexibleCompanyDemo {
	public static void main(String[] args) {

		Employee[] emps = new Employee[3];
		emps[0] = new MereClerk("철수", 100);
		emps[1] = new MereClerk("영희", 100);
		emps[2] = new Manager("홍길동", 200, "개발자");

		System.out.println("현재 월급입니다.");
		for (Employee emp : emps) {
			System.out.println(emp.getName() + "의 현재 월급은 " + emp.getSalary() + " 만원 입니다.");
		}

		System.out.println("");

		System.out.println("올린 후의 월급입니다.");

		for (Employee emp : emps) {
			emp.manageSalary(10);
			System.out.println(emp.getName() + "의 현재 월급은 " + emp.getSalary() + " 만원 입니다.");
		}

		// Reference Type casting
		Employee emp1 = new Manager("길동홍", 200, "개발");
		Manager mgr = (Manager) emp1;
		System.out.println(mgr.getDeptName());
		
		

	}
}
