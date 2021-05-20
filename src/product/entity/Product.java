package product.entity;

public class Product {
//	Product (상품)
//	String name; //상품이름
//	int price; //상품가격
//	int quantity; //상품수량

	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int price;
	public int quantity;
	
//	기본생성자를 만드세요
	public Product() {
	}

//	이름과 가격을 인자로 받는 생성자를 만드세요
	public Product(String name,int price){
		this.name = name;
		this.price = price;;
	}
	
//	이름과 가격과 수량을 인자로 받는 생성자를 만드세요
//	(이름과 가격을 인자로 받는 생성자를 호출하세요)
	public Product(String name,int price,int quantity){
		this(name,price);
		this.quantity = quantity;
	}
}
