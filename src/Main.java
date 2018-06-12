import openclose.InsertionSort;
import openclose.MergeSort;
import openclose.SorterManager;
import single.Book;

public class Main {

	public static void main(String[] args) {
		
		// Single principle
		Book book = new Book("first book", 200);
		book.save();
		
		// Open Close principle
		SorterManager sorter = new SorterManager();
		sorter.sort(new InsertionSort());
		sorter.sort(new MergeSort());
	}

}
