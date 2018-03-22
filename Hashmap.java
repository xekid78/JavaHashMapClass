/**
 *
 * @author xekid78
 *
 */
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String> enemyMap = new HashMap<String, String>();
		enemyMap.put("ザコ", "スライム");
		enemyMap.put("ラスボス", "ドラゴン");
		System.out.println(enemyMap.get("ザコ"));
		System.out.println(enemyMap.get("ラスボス"));

		enemyMap.put("ザコ", "モンスター");
		System.out.println(enemyMap.get("ザコ"));

	}

}
