package product.test;

import java.util.Scanner;

import product.entity.Product;

public class TestProduct {
	public static void main(String[] args) {
//		Product�� �⺻�����ڸ� ȣ���ϼ���
//		��ǰ�̸��� �������š� ������ 10000 ������ 1�� �ʱ�ȭ �ϼ���
//		��ǰ�̸��� ����, ������ ����ϼ���
		Scanner scan = new Scanner(System.in);
		Product product1 = new Product();
		System.out.println("��ǰ���� �Է��ϼ���>");
		product1.name = scan.nextLine();
		System.out.println("������ �Է��ϼ���>");
		product1.price = scan.nextInt();
		System.out.println("������ �Է��ϼ���>");
		product1.quantity = scan.nextInt();
		
		
		
		
		
		
		System.out.println("��ǰ�̸�:\t"+product1.name);
		System.out.println("����:\t\t"+product1.price);
		System.out.println("����:\t\t"+product1.quantity);
		System.out.println();

//		Product�� �̸��� ������ ���ڷ� �޴� �����ڸ� ȣ���ϼ���
//		��ǰ�̸��� ������� ������ 200000 �� ���� �����ϼ���
//		��ǰ�̸��� ������ ����ϼ���
		Product product2 = new Product("�����", 200000);

		System.out.println("��ǰ�̸�:\t"+product2.name);
		System.out.println("����:\t\t"+product2.price);
//		System.out.println("����:\t\t"+product2.quantity);
		System.out.println();
//		Product�� �̸�,����,������ ���ڷ� �޴� �����ڸ� ȣ���ϼ���
//		��ǰ�̸��� �����桱 ������ 10000 ������ 2 �� �����ϼ��� 
//		��ǰ�̸�,����,������ ����ϼ���
		Product product3 = new Product("����", 10000, 2);

		System.out.println("��ǰ�̸�:\t"+product3.name);
		System.out.println("����:\t\t"+product3.price);
		System.out.println("����:\t\t"+product3.quantity);
		
		scan.close();
	}
}
