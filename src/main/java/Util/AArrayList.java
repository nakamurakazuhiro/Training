package Util;

import java.util.ArrayList;

public class AArrayList {

	public static void main(String[] args) {
		// ArrayListの作成
		ArrayList<String> arrayList = new ArrayList<>();

		// 要素の追加
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");

		// 要素の取得
		System.out.println("ArrayListを表示 : " + arrayList);

		// 要素の取得（インデックス指定）
		System.out.println("ArrayListの2番目を表示: " + arrayList.get(1));

		// 要素の変更
		arrayList.set(0, "Grapes");
		System.out.println("ArrayListの1番目を変更: " + arrayList);

		// 要素の削除
		arrayList.remove("Banana");
		System.out.println("ArrayListからBananaを削除: " + arrayList);

		// インデックスを指定して要素の削除
		arrayList.remove(1);
		System.out.println("ArrayListから２番目を削除: " + arrayList);

		// リストのサイズ
		System.out.println("ArrayListの箱数を表示: " + arrayList.size());

		// 要素の検索
		System.out.println("ArrayListにOrangeがあるか調べる: " + arrayList.contains("Orange"));
		System.out.println("ArrayListにGrapesがあるか調べる: " + arrayList.contains("Grapes"));

		// リストのクリア
		arrayList.clear();
		System.out.println("ArrayListの箱数を表示: " + arrayList.size());
	}
}
