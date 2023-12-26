package Util;

import java.util.HashMap;
import java.util.Map;

public class HHashMap {

	public static void main(String[] args) {
		// HashMapの作成
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		// キーと値の追加
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		System.out.println(hashMap);
		
		// キーを使用した値の取得
		System.out.println("キーがTwoの値は: " + hashMap.get("Two"));
		System.out.println("キーがFourの値は: " + hashMap.get("Four"));
		
		// キーの存在チェック
		System.out.println("キーがTwoがあるかないか: " + hashMap.containsKey("Two"));
		System.out.println("キーがFourがあるかないか: " + hashMap.containsKey("Four"));
		
		// 値の存在チェック
		System.out.println("値2があるかないか: " + hashMap.containsValue(2));
		System.out.println("値4があるかないか: " + hashMap.containsValue(4));
		
		// キーを使用した値の削除
		hashMap.remove("Three");
		System.out.println(hashMap);
		
		// HashMapのサイズ
		int size = hashMap.size();
		System.out.println("HashMapの要素数は: " + size);
		
		// 全てのキーと値の取得
		System.out.println("HashMapキーと値を表示");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		// HashMapのクリア
		hashMap.clear();
		System.out.println("クリア後のHashMapの要素数は: " + hashMap.size());
	}
}
