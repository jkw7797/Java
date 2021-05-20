package oop.flexible;

public class FlexibleCompanyDemo {
	public static void main(String[] args) {

		Employee[] emps = new Employee[3];
		emps[0] = new MereClerk("ö��", 100);
		emps[1] = new MereClerk("����", 100);
		emps[2] = new Manager("ȫ�浿", 200, "������");

		System.out.println("���� �����Դϴ�.");
		for (Employee emp : emps) {
			System.out.println(emp.getName() + "�� ���� ������ " + emp.getSalary() + " ���� �Դϴ�.");
		}

		System.out.println("");

		System.out.println("�ø� ���� �����Դϴ�.");

		for (Employee emp : emps) {
			emp.manageSalary(10);
			System.out.println(emp.getName() + "�� ���� ������ " + emp.getSalary() + " ���� �Դϴ�.");
		}

		// Reference Type casting
		Employee emp1 = new Manager("�浿ȫ", 200, "����");
		Manager mgr = (Manager) emp1;
		System.out.println(mgr.getDeptName());
		
		

	}
}
