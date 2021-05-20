package oop.flexible;

public class TestInheritance {

	public static void main(String[] args) {
		// Manager ��ü����
		Manager mgr = new Manager("������1", 200.0);
		System.out.println(mgr.getName());
		System.out.println(mgr.getSalary());
		System.out.println();
		MereClerk clerk = new MereClerk("����1", 200.0);
		System.out.println(clerk.getName());
		System.out.println(clerk.getSalary());
		
//		Employee emp = new Employee("�뵿��11",2000.0);
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
		
		Manager man = new Manager("�뵿��11",2000.0,"�λ��");
		System.out.println(man.getInfo());
		
		//������(Polymorphism)�� �����ؼ� ��ü�� �����ϱ�
		//One Interface, Multiple Implementation
		System.out.println();
		Employee emp1 = new Manager("������1", 150);
		Employee emp2 = new MereClerk("������2", 130);
		
		System.out.println(emp1.getInfo());
		System.out.println(emp2.getInfo());
		System.out.println();
		//MyDatep[ dates = new MyDate[2] - Homogeneous Collection
		//Employee[] emps = new Employee[2]
		//emps = new Manaager() - Heterogeneous Collection ->���°� �ٸ���
		
		Employee[] emps = new Employee[2];
		emps[0] = new Manager("������1", 150.0, "���ߺ�");
		emps[1] = new MereClerk("������2", 130.0);
		System.out.println();
		for(Employee emp:emps) {
			System.out.println(emp.getInfo());
		}
		System.out.println();
		//MereClerk�� ���� �����̱� ������ Manager�� ����ȯ�� �ȵ�
		for(Employee emp:emps) {
			System.out.print(emp.getName() + "\t");
			if(emp instanceof Manager) {
				Manager manager = (Manager)emp;
				System.out.println(manager.getDeptName());
			}
			
		}


	}

}
