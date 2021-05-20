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
		printTitle("Book ���� ���");
		for (Publication i : publication) {
			System.out.println(i);
		}
	}

	public void fillbook(Publication[] publication) {
		publication[0] = new Magazine("����ũ�μ���Ʈ", "2007-10-01", 328, 9900, "�ſ�");
		publication[1] = new Magazine("�濵����ǻ��", "2007-10-03", 316, 9000, "�ſ�");
		publication[2] = new Novel("���߿�", "2007-07-01", 396, 9800, "����������������", "����Ҽ�");
		publication[3] = new Novel("���ѻ꼺", "2007-04-14", 383, 11000, "����", "���ϼҼ�");
		publication[4] = new ReferenceBook("�ǿ��������α׷���", "2007-01-14", 496, 25000, "����Ʈ�������");
	}

	public void modifyPrice(Publication pub) {
		printTitle("�������� ���� ��");
		System.out.println(pub.getTitle() + " : " + pub.getPrice());
		System.out.println();
		if (pub instanceof Magazine) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 40 / 100));
		} else if (pub instanceof Novel) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 20 / 100));
		} else if (pub instanceof ReferenceBook) {
			pub.setPrice(pub.getPrice() - (pub.getPrice() * 10 / 100));
		}
		printTitle("�������� ���� ��");
		System.out.println(pub.getTitle() + " : " + pub.getPrice());
	}
}
