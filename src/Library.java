import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;
	
	public Library(String name) {
		this.name = name;
		books = new ArrayList<Book>();
	}
}
