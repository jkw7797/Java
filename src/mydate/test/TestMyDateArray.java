package mydate.test;

import mydate.MyDate;

public class TestMyDateArray {
	public static void main(String[] args) {
		MyDate[] mDs = new MyDate[3];
		System.out.println(mDs);
		System.out.println(mDs[0]);
		
		//각각의 배열의 값을 초기화
		fillArray(mDs);		
		printArray(mDs);
		
		//enhanced for loop
		for(MyDate i: mDs) {
			int year = i.getYear();
			int month = i.getMonth();
			int day = i.getDay();
			System.out.printf("%d - %d - %d\n",year,month,day);
		}
		
		
	}//main

	public static void printArray(MyDate[] mDs) {
		for (int i = 0; i < mDs.length; i++) {
			MyDate date = mDs[i];
			int year = date.getYear();
			int month = date.getMonth();
			int day = date.getDay();
			System.out.printf("%d - %d - %d\n",year,month,day);
		}
	}

	public static void fillArray(MyDate[] mDs) {
		mDs[0]= new MyDate(2021,5,20);
		mDs[1]= new MyDate(2021,6,1);
		mDs[2]= new MyDate(2021,1,1);
	}
	
	
	
}//class