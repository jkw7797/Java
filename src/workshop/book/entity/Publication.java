package workshop.book.entity;

public class Publication {
	private String title;
	private String publishingData;
	private int page;
	private int price;

	public Publication() {
	}

	public Publication(String title, String publishingData, int page, int price) {
		setTitle(title);
		setPublishingData(publishingData);
		setPage(page);
		setPrice(price);
	}
	
	@Override
	public String toString() { 
		return title;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishingData() {
		return publishingData;
	}

	public void setPublishingData(String publishingData) {
		this.publishingData = publishingData;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
