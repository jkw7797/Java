package product.entity;

public class Product {
//	Product (��ǰ)
//	String name; //��ǰ�̸�
//	int price; //��ǰ����
//	int quantity; //��ǰ����

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
	
//	�⺻�����ڸ� ���弼��
	public Product() {
	}

//	�̸��� ������ ���ڷ� �޴� �����ڸ� ���弼��
	public Product(String name,int price){
		this.name = name;
		this.price = price;;
	}
	
//	�̸��� ���ݰ� ������ ���ڷ� �޴� �����ڸ� ���弼��
//	(�̸��� ������ ���ڷ� �޴� �����ڸ� ȣ���ϼ���)
	public Product(String name,int price,int quantity){
		this(name,price);
		this.quantity = quantity;
	}
}
