  package mydate;

public class MyDate {
//	�� <- ��ü����
	public int year;
//	��
	public int month;
//	��
	public int day;
	
	//�⺻ ������
	public MyDate() {
	}
	
	//��,��,���� �ƱԸ�Ʈ�� �޴� ������ ����
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMmonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
