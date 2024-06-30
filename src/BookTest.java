import java.util.HashMap;
import java.util.Map;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Book, Integer> library = new HashMap<>();
		library.put(new Book("001", "プログラミング入門"), 5);
		library.put(new Book("002", "Javaの基礎"), 3);
		for (Map.Entry<Book, Integer> entry : library.entrySet()) {
			Book book = entry.getKey();
			Integer quantity = entry.getValue();
			System.out.println(book.title + " の所蔵数： " + quantity);
		}

	}

}
