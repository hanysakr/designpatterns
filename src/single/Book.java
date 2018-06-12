package single;

public class Book implements BookHandler {

	private String title;
	private int numberOfPages;
	private BookPersistence bookPersistence;
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.bookPersistence = new BookPersistence();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString() {
		return title + "-" + numberOfPages;
	}

	@Override
	public void save() {
		bookPersistence.save(this);
	}
}
