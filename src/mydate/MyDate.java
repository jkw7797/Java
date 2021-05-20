  package mydate;

public class MyDate {
//	년 <- 객체변수
	public int year;
//	월
	public int month;
//	일
	public int day;
	
	//기본 생성자
	public MyDate() {
	}
	
	//년,월,일을 아규먼트로 받는 생성자 선언
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
