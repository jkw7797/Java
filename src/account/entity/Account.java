package account.entity;

public class Account {
	private String custId;	// ����ȣ
	private String acctId;	//���¹�ȣ
	private int balance;	//�ܾ�
	
	private String custId2;	// ����ȣ
	private String acctId2;	//���¹�ȣ
	private int balance2;

	public Account() {
	}
	
	public Account(String custId2, String acctId2,int balance2) {
		this.custId2 = custId2;
		this.acctId2 = acctId2;
		this.balance2 = balance2;
	}
	
	public void setBalance(int newBalance) {	//�ܾ�(balance)�� ���� �Ҵ�
		balance = newBalance;
	}

	
	public int getBalance() {					//�ܾ��� �� ���
		return balance;
	}
	
	
	public void setCustId(String newCustId) {		//custId �Ҵ�
		custId = newCustId;
	}

	
	public String getCustId() {					//custId ���
		return custId;
	}
	
	
	public void setAcctId(String newAcctId) {		//acctId �Ҵ�
		acctId = newAcctId;
	}

	
	public String getAcctId() {					//acctId ���
		return acctId;
	}
	
	
	public void deposit(int amount) {//�Է��� �ݾ׸�ŭ ����(�Ա�) ��Ű�� �޼���
		balance += amount;	//balance + amount
	}
	
	
	public void withdraw(int amount) {//�Է��� �ݾ׸�ŭ ����(���) ��Ű�� �޼���
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
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
