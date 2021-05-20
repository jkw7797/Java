package account.test;

import account.entity.Account;

public class TestAccount {
	public static void main(String[] args) {
//		a. Account 클래스의 객체를 생성합니다 (new 연산자를 사용함)
		Account account = new Account();
		
//		b. 생성한 Account 객체의 멤버변수의 값을 아래와 같이 할당합니다.
//		고객번호 : “A1100”, 계좌번호 : “221-22-3477”, 잔액 : 100000 //set method
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.setBalance(100000);
		
//		c. 고객번호와 계좌번호를 화면에 출력합니다.
		String cusId = account.getCustId();
		String acctId = account.getAcctId();
		int balance = account.getBalance();
		
		System.out.printf("고객번호: %s\n계좌번호: %s\n", cusId, acctId);
		
		
//		d. 잔액을 화면에 출력합니다.
		System.out.printf("잔액: %d\n", balance);
		
//		e. 잔액을 10000원 증가시킵니다.
		account.deposit(10000);
		
//		f. 잔액을 화면에 출력합니다.
		System.out.printf("잔액: %d\n", account.getBalance());
		
//		g. 잔액을 20000원 감소시킵니다.
		account.withdraw(100000);
		
//		h. 잔액을 화면에 출력합니다.
		System.out.printf("잔액: %d\n", account.getBalance());
		
		
		Account account2 = new Account("B2100", "3311-22-3477",200000);
		System.out.println(account2.getCustId2());
		System.out.println(account2.getAcctId2());
		System.out.println(account2.getBalance2());
		
		
	}
}
