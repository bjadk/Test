import java.util.HashMap;
import java.util.Map;

/**
 * Mapインターフェースを使用して、各都市とその人口を管理するプログラムを作成してください。以下の要件に従ってください。
 * 
 * 各都市の名前（String型）とその人口（Integer型）を保持するMapを作成します。 複数の都市とその人口をMapに追加します。
 * 特定の都市の人口を更新する機能を実装します。 全ての都市とその人口を表示する機能を実装します。
 * 
 */
public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> cityPopulation = new HashMap<>();
		cityPopulation.put("東京", 13929286);
		cityPopulation.put("ニューヨーク", 8419000);
		cityPopulation.put("ロンドン", 8982000);
		cityPopulation.put(" 東京", 9000000);
		for( Map.Entry< String ,Integer> entry :cityPopulation.entrySet()) {
			System.out.println(entry.getKey() + "の人口: " + entry.getValue());
		}
 
	}

}
