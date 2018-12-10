package Author;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	@Override
	public String toString() {
		return "Book [name= " + name + ", author= " + author + ", price= " + price + ", qtyInStock= " + qtyInStock + "]";
	}
	
	
	
	
	
	
}
