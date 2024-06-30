/**
 * Mapインターフェースを使って、図書館の書籍とその所蔵数を管理するプログラムを作成してください。以下の要件に従ってください。
 * 
 * Bookクラスを作成します。このクラスには、書籍のID（id）とタイトル（title）を表すString型のフィールドがあります。 Map<Book,
 * Integer>のインスタンスを作成し、Bookオブジェクト（書籍）とその所蔵数（整数）を関連付けます。
 * 書籍の所蔵数を追加、削除、変更するメソッドを実装します。 特定の書籍の所蔵数を表示するメソッドを実装します。
 */
public class Book {
	String id;
	String title;

	Book(String id, String title) {
		this.id = id;
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Book))
			return false;
		Book book = (Book) o;
		return id.equals(book.id) && title.equals(book.title);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
