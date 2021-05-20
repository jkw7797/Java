package oop.flexible;

public class TestInheritance {

	public static void main(String[] args) {
		// Manager 객체생성
		Manager mgr = new Manager("관리자1", 200.0);
		System.out.println(mgr.getName());
		System.out.println(mgr.getSalary());
		System.out.println();
		MereClerk clerk = new MereClerk("평사원1", 200.0);
		System.out.println(clerk.getName());
		System.out.println(clerk.getSalary());
		
//		Employee emp = new Employee("노동자11",2000.0);
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
		
		Manager man = new Manager("노동자11",2000.0,"인사부");
		System.out.println(man.getInfo());
		
		//다형성(Polymorphism)을 적용해서 객체를 생성하기
		//One Interface, Multiple Implementation
		System.out.println();
		Employee emp1 = new Manager("다형성1", 150);
		Employee emp2 = new MereClerk("다형성2", 130);
		
		System.out.println(emp1.getInfo());
		System.out.println(emp2.getInfo());
		System.out.println();
		//MyDatep[ dates = new MyDate[2] - Homogeneous Collection
		//Employee[] emps = new Employee[2]
		//emps = new Manaager() - Heterogeneous Collection ->형태가 다르다
		
		Employee[] emps = new Employee[2];
		emps[0] = new Manager("다형성1", 150.0, "개발부");
		emps[1] = new MereClerk("다형성2", 130.0);
		System.out.println();
		for(Employee emp:emps) {
			System.out.println(emp.getInfo());
		}
		System.out.println();
		//MereClerk은 같은 레벨이기 때문에 Manager로 형변환이 안됨
		for(Employee emp:emps) {
			System.out.print(emp.getName() + "\t");
			if(emp instanceof Manager) {
				Manager manager = (Manager)emp;
				System.out.println(manager.getDeptName());
			}
			
		}


	}

}
