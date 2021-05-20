package account.entity;

public class Account {
	private String custId;	// 고객번호
	private String acctId;	//계좌번호
	private int balance;	//잔액
	
	private String custId2;	// 고객번호
	private String acctId2;	//계좌번호
	private int balance2;

	public Account() {
	}
	
	public Account(String custId2, String acctId2,int balance2) {
		this.custId2 = custId2;
		this.acctId2 = acctId2;
		this.balance2 = balance2;
	}
	
	public void setBalance(int newBalance) {	//잔액(balance)의 값을 할당
		balance = newBalance;
	}

	
	public int getBalance() {					//잔액의 값 출력
		return balance;
	}
	
	
	public void setCustId(String newCustId) {		//custId 할당
		custId = newCustId;
	}

	
	public String getCustId() {					//custId 출력
		return custId;
	}
	
	
	public void setAcctId(String newAcctId) {		//acctId 할당
		acctId = newAcctId;
	}

	
	public String getAcctId() {					//acctId 출력
		return acctId;
	}
	
	
	public void deposit(int amount) {//입력한 금액만큼 증가(입금) 시키는 메서드
		balance += amount;	//balance + amount
	}
	
	
	public void withdraw(int amount) {//입력한 금액만큼 감소(출금) 시키는 메서드
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			balance -= amount;	//balance - amount
		}
		
	}

	public String getCustId2() {
		return custId2;
	}

	public void setCustId2(String custId2) {
		this.custId2 = custId2;
	}

	public String getAcctId2() {
		return acctId2;
	}

	public void setAcctId2(String acctId2) {
		this.acctId2 = acctId2;
	}

	public int getBalance2() {
		return balance2;
	}

	public void setBalance2(int balance2) {
		this.balance2 = balance2;
	}
	
}
