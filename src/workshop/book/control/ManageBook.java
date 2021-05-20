package workshop.book.control;

import workshop.book.entity.*;
//import workshop.book.entity.Magazine;
//import workshop.book.entity.Novel;
//import workshop.book.entity.Publication;
//import workshop.book.entity.ReferenceBook;

public class ManageBook {
	public static void main(String[] args) {
		ManageBook mBook = new ManageBook();
		Publication[] publication = new Publication[5];

		mBook.fillbook(publication);

		mBook.printbookname(publication);

		mBook.modifyPrice(publication[2]);

	}

	public void printTitle(String title) {
		System.out.println("==== " + title + " ====");
	}

	public void printbookname(Publication[] publication) {
		printTitle("Book 정보 출력");
		for (Publication i : publication) {
			System.out.println(i);
		}
	}

	public void fillbook(Publication[] publication) {
		publication[0] = new Magazine("마이크로소프트", "2007-10-01", 328, 9900, "매월");
		publication[1] = new Magazine("경영과컴퓨터", "2007-10-03", 316, 9000, "매월");
		publication[2] = new Novel("빠삐용", "2007-07-01", 396, 9800, "베르나르베르베르", "현대소설");
		publication[3] = new Novel("남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설");
		publication[4] = new ReferenceBook("실용주의프로그래머", "2007-01-14", 496, 25000, "소프트웨어공학");
	}

	public void modifyPrice(Publication pub) {
		printTitle("가격정보 변경 전");
		System.out.println(pub.getTitle() + " : " + pub.getPrice());
		System.out.println();
		if (pub instanceof Magazine) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 40 / 100));
		} else if (pub instanceof Novel) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 20 / 100));
		} else if (pub instanceof ReferenceBook) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 10 / 100));
		}
		printTitle("가격정보 변경 후");
		System.out.println(pub.getTitle() + " : " + pub.getPrice());
	}
}
