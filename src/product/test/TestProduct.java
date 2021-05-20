package product.test;

import java.util.Scanner;

import product.entity.Product;

public class TestProduct {
	public static void main(String[] args) {
//		Product의 기본생성자를 호출하세요
//		상품이름은 “자전거” 가격은 10000 수량은 1로 초기화 하세요
//		상품이름과 가격, 수량을 출력하세요
		Scanner scan = new Scanner(System.in);
		Product product1 = new Product();
		System.out.println("상품명을 입력하세요>");
		product1.name = scan.nextLine();
		System.out.println("가격을 입력하세요>");
		product1.price = scan.nextInt();
		System.out.println("수량을 입력하세요>");
		product1.quantity = scan.nextInt();
		
		
		
		
		
		
		System.out.println("상품이름:\t"+product1.name);
		System.out.println("가격:\t\t"+product1.price);
		System.out.println("수량:\t\t"+product1.quantity);
		System.out.println();

//		Product의 이름과 가격을 인자로 받는 생성자를 호출하세요
//		상품이름은 “냉장고” 가격은 200000 인 값을 전달하세요
//		상품이름과 가격을 출력하세요
		Product product2 = new Product("냉장고", 200000);

		System.out.println("상품이름:\t"+product2.name);
		System.out.println("가격:\t\t"+product2.price);
//		System.out.println("수량:\t\t"+product2.quantity);
		System.out.println();
//		Product의 이름,가격,수량을 인자로 받는 생성자를 호출하세요
//		상품이름은 “가방” 가격은 10000 수량은 2 로 전달하세요 
//		상품이름,가격,수량을 출력하세요
		Product product3 = new Product("가방", 10000, 2);

		System.out.println("상품이름:\t"+product3.name);
		System.out.println("가격:\t\t"+product3.price);
		System.out.println("수량:\t\t"+product3.quantity);
		
		scan.close();
	}
}
