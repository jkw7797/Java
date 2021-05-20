package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public PersonManager() {

	}

//	4) main() : PersonEntity[ ] ��ü���� �����Ͽ� ȭ�鿡 ����Ѵ�.
	public static void main(String[] args) {
//		a. main() �޼���� static �޼��� �̹Ƿ� static�� �ƴ� �޼��带 ����ϱ� ���� PersonManager 
//		pManager = new PersonManager() ��ü�� �����Ѵ�.
		PersonManager pManager = new PersonManager();
		PersonEntity per = new PersonEntity();

//		b. printTitle(String Title) , printTitleLine()�� �̿��ؼ� Ÿ��Ʋ�� ����Ѵ�.
		pManager.printTitle("@@@ �ι� ���� ��ȸ �ý��� @@@");
		pManager.printTitleLine();

//		c. PersonEntity[ ] persons = new PersonEntity[10]; ���� PersonEntity �迭�� �����Ѵ�.
		PersonEntity[] persons = new PersonEntity[10];

//		d. fillPersons(PersonEntity[] persons)�� ȣ���Ͽ� persons�� ������ set �Ѵ�.
		pManager.fillPersons(persons);

//		e. showPerson(PersonEntity[] persons)�� ȣ���Ͽ� ��ü persons ������ display �Ѵ�.
		pManager.showPerson(persons);

//		f. findByGender(PesonEntity[] persons, char gender)�� ȣ���Ͽ� persons ��ü ���� �� �ش� gender
//		�� �ο����� return �޴´�. �̶� ������ ������ ��� ������ �˻��Ѵ�.
		pManager.findByGender(persons, '��');
//		g. showPerson(PersonEntity[] persons, String name)�� ȣ���Ͽ� Ư�� person�� �������� display 
//		�Ѵ�. �̶� �̸� ������ �����ϴá� �� �Ѵ�
		pManager.showPerson(persons, "���ϴ�");
	}

	public void printTitle(String printTitle) {
		System.out.println("\n" + printTitle);
	}

	public void printTitleLine() {
		System.out.println("============================================================");
	}

	public void printItemLine() {
		System.out.println("------------------------------------------------------------");
	}

	public void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("�̼�ȣ", "7212121028102", "��õ ��籸", "032-392-2932");
		persons[1] = new PersonEntity("���ϴ�", "7302132363217", "���� ������", "02-362-1932");
		persons[2] = new PersonEntity("�ڿ���", "7503111233201", "���� ���ϱ�", "02-887-1542");
		persons[3] = new PersonEntity("���μ�", "7312041038988", "���� ������", "032-384-2223");
		persons[4] = new PersonEntity("ȫ����", "7606221021341", "���� ��õ��", "02-158-7333");
		persons[5] = new PersonEntity("�̹̼�", "7502142021321", "���� ������", "02-323-1934");
		persons[6] = new PersonEntity("�ڼ���", "7402061023101", "���� ���α�", "02-308-0932");
		persons[7] = new PersonEntity("������", "7103282025101", "���� ����", "02-452-0939");
		persons[8] = new PersonEntity("Ȳ����", "7806231031101", "��õ �߱�", "032-327-2202");
		persons[9] = new PersonEntity("��ö��", "7601211025101", "��õ ��籸", "032-122-7832");

	}

	public void showPerson(PersonEntity[] persons) {
		for (PersonEntity i : persons) {
			System.out.printf("[�̸�] %s\t[����] %c\t[��ȭ��ȣ] %s\t\n", i.getName(), i.getGender(), i.getPhone());
			printItemLine();

		}
	}

	public void findByGender(PersonEntity[] persons, char gender) {
		int count = 0;
		for (PersonEntity i : persons) {
			if (i.getGender() == gender) {
				count++;
			}

		}
		System.out.printf("����: \'%c\'��(��) %d�� �Դϴ�.\n", gender, count);
		
	}

	public void showPerson(PersonEntity[] persons, String name) {
		printTitleLine();
		System.out.printf("-- �̸� : \' %s \' (��)�� ã�� ����Դϴ�. --\n", name);
		printItemLine();
		for (PersonEntity i : persons) {
			if (name.equals(i.getName())) {
				System.out.println("[�̸�] \t\t" + i.getName());
				System.out.println("[����] \t\t" + i.getGender());
				System.out.println("[��ȭ��ȣ]\t" + i.getPhone());
				System.out.println("[�ּ�] \t\t" + i.getAddress());

			}
		}
	}

}
