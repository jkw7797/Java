package workshop.book.entity;

public class Novel extends Publication{
	private String author;
	private String gender;

	public Novel() {

	}

	public Novel(String title, String publishingData, int page, int price, String author, String gender) {
		super(title, publishingData, page, price);
		this.author = author;
		this.gender = gender;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
