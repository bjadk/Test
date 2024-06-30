import java.util.HashMap;
import java.util.Map;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Product, Integer> inventory = new HashMap<>();
		inventory.put(new Product("001", "ペン"), 40);
		inventory.put(new Product("002", "ノート"), 100);
		for (Map.Entry<Product, Integer> entry : inventory.entrySet()) {
			Product product = entry.getKey();
			Integer quantity = entry.getValue();
			System.out.println(product.name + "の在庫数量" + quantity);

		}

	}

}
