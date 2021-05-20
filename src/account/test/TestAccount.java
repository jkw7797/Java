package account.test;

import account.entity.Account;

public class TestAccount {
	public static void main(String[] args) {
//		a. Account Ŭ������ ��ü�� �����մϴ� (new �����ڸ� �����)
		Account account = new Account();
		
//		b. ������ Account ��ü�� ��������� ���� �Ʒ��� ���� �Ҵ��մϴ�.
//		����ȣ : ��A1100��, ���¹�ȣ : ��221-22-3477��, �ܾ� : 100000 //set method
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.setBalance(100000);
		
//		c. ����ȣ�� ���¹�ȣ�� ȭ�鿡 ����մϴ�.
		String cusId = account.getCustId();
		String acctId = account.getAcctId();
		int balance = account.getBalance();
		
		System.out.printf("����ȣ: %s\n���¹�ȣ: %s\n", cusId, acctId);
		
		
//		d. �ܾ��� ȭ�鿡 ����մϴ�.
		System.out.printf("�ܾ�: %d\n", balance);
		
//		e. �ܾ��� 10000�� ������ŵ�ϴ�.
		account.deposit(10000);
		
//		f. �ܾ��� ȭ�鿡 ����մϴ�.
		System.out.printf("�ܾ�: %d\n", account.getBalance());
		
//		g. �ܾ��� 20000�� ���ҽ�ŵ�ϴ�.
		account.withdraw(100000);
		
//		h. �ܾ��� ȭ�鿡 ����մϴ�.
		System.out.printf("�ܾ�: %d\n", account.getBalance());
		
		
		Account account2 = new Account("B2100", "3311-22-3477",200000);
		System.out.println(account2.getCustId2());
		System.out.println(account2.getAcctId2());
		System.out.println(account2.getBalance2());
		
		
	}
}
