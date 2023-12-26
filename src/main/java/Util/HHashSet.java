package Util;

import java.util.HashSet;

public class HHashSet {

	public static void main(String[] args) {
        // HashSetの作成
		HashSet<String> hashSet = new HashSet<>();

        // 要素の追加
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // 要素の追加（重複は許容されないため、重複しても追加されません）
        boolean added = hashSet.add("Apple");
        System.out.println("追加できたか? " + added);

        // 要素の存在チェック
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("リスト内にBananaがあるか? " + containsBanana);

        // セットのサイズ
        System.out.println("リストの要素数: " + hashSet.size());

        // 要素の削除
        hashSet.remove("Orange");
        System.out.println("リストからOrangeを削除: " + hashSet);

        // セットのクリア
        hashSet.clear();
        System.out.println("リスト要素数: " + hashSet.size());
    }

}
