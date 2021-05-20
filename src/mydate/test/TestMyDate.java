package mydate.test;

import mydate.MyDate;

public class TestMyDate {
	public static void main(String[] args) {
		
		MyDate myDate = new MyDate(2021,5,15);
		System.out.println(myDate.getYear());
		System.out.println(myDate.getMonth());
		System.out.println(myDate.getDay());
		
		MyDate myDate2 = new MyDate(1999,17,50);
		System.out.println(myDate2.getYear());
		System.out.println(myDate2.getMonth());
		System.out.println(myDate2.getDay());
		String a = "가나다라마바사";
		System.out.println(a.charAt(2));
		
		MyDate myDate3 = new MyDate(2021,5,15);
		System.out.println(myDate3.getYear());
		System.out.println(myDate3.getMonth());
		System.out.println(myDate3.getDay());
		                         
		
	
	}
}
