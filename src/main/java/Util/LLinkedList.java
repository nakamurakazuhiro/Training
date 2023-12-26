package Util;

import java.util.LinkedList;

public class LLinkedList {

	public static void main(String[] args) {
        // LinkedListの作成
        LinkedList<String> linkedList = new LinkedList<>();

        // 要素の追加
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 要素の取得
        System.out.println("Elements in the LinkedList: " + linkedList);

        // 要素の取得（インデックス指定）
        String secondElement = linkedList.get(1);
        System.out.println("Second element: " + secondElement);

        // 要素の変更
        linkedList.set(0, "Grapes");
        System.out.println("After updating, LinkedList: " + linkedList);

        // 要素の削除
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana', LinkedList: " + linkedList);

        // インデックスを指定して要素の削除
        linkedList.remove(1);
        System.out.println("After removing element at index 1, LinkedList: " + linkedList);

        // リストのサイズ
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // 要素の検索
        boolean containsOrange = linkedList.contains("Orange");
        System.out.println("LinkedList contains 'Orange': " + containsOrange);

        // リストのクリア
        linkedList.clear();
        System.out.println("After clearing the LinkedList, size: " + linkedList.size());
    }

}
