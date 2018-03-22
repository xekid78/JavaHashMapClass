# JavaHashMapClass
HashMapクラス（連想配列）

## 処理
HashMapクラスを使ってザコとラスボスの表示。

## コード
```
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
```

## 出力結果  
```
スライム
ドラゴン
モンスター
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
