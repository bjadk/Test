/**
 * Mapインターフェースを使って、小売店の商品在庫を管理するプログラムを作成してください。以下の要件に従ってください。
 * 
 * Productクラスを作成します。このクラスには、商品のID（id）と商品名（name）を表すString型のフィールドがあります。
 * Map<Product, Integer>のインスタンスを作成し、Productオブジェクト（商品）とその在庫数量（整数）を関連付けます。
 * 商品の在庫を追加、削除、変更するメソッドを実装します。 特定の商品の在庫数量を表示するメソッドを実装します。
 */
public class Product {
	String id;
	String name;

	Product(String id, String name) {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Product))
			return false;
		Product product = (Product) o;
		return id.equals(product.id) && name.equals(product.name);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
