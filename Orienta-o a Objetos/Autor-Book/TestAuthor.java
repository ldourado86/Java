package Author;

public abstract class TestAuthor {

	public static void main(String[] args) {
		
		Author anAuthor = new Author("Tan ah Tech", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor); // chamando metodo toString implicito.
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor); // chamando metodo toString implicito.

	}

}
