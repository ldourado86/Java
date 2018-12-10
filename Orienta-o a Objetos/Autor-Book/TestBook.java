package Author;

public class TestBook {

	public static void main(String[] args) {

		Author anAuthor = new Author("Leandro", "ldourado@gmail.com", 'M');
		Book aBook = new Book("java for dummy",anAuthor, 19.95, 1000);
		Book anotherBook = new Book("more java for dummy", new Author("Pedro","pedro@gmail.com",'M'), 29.95, 888);

		System.out.println(aBook);
		System.out.println(anotherBook);
	}

}
