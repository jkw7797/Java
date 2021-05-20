package member_entity;

public class Member {
	public String name;
	public String addr;
	public int age;
	
	//������ �ߺ�����(constructor overloading)
	
	//�⺻������(default constructor)����
	//�������� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	//�����ڴ� ����Ÿ���� ����. (void�� �ƴϴ�.)
	//�����ڰ� ȣ��Ǵ� ������ new �����ڸ� �̿��� ��ü�� �����Ҷ� ȣ��ȴ�.
	public Member() {
		System.out.println("�⺻������ ȣ���!!");
		name = "����";
		age =10;
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member(String name, int age, String addr) {
//		this.name = name;
//		this.age = age;
		this(name,age);
		this.addr = addr;
	}
}
