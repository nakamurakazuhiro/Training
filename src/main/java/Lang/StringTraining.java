package Lang;

public class StringTraining {

	public static void main(String[] args) {
		String str = "Hello, World!";
		String STR = "HELLO, WORLD!";
		
		//文字列の長さ（文字数）を返します。
		System.out.println("文字の長さ : "+str.length());
		
		//文字列のN番目の文字を返す。
		System.out.println("5番目の文字は : "+str.charAt(4));

		//文字列のN番目以降の文字を表示
		System.out.println("8番目以降の文字は : "+str.substring(7));
		
		//文字列のN番目以降の文字を表示
		System.out.println("8から１２の間の文字は : "+str.substring(7,11));
		
		//大文字に変換します。
		System.out.println("大文字に変換します。 : "+str.toUpperCase());
		
		//小文字に変換します。
		System.out.println("大文字に変換します。 : "+STR.toLowerCase());
		
		//他のオブジェクトと文字列が等しいかどうかを比較します。
		boolean isEqual1 = str.equals(STR);
		System.out.println("結果 : " + isEqual1);
		
		boolean isEqual2 = str.equals("Hello, World!");
		System.out.println("結果 : " + isEqual2);
		
		//大文字小文字を無視して、他の文字列と等しいかどうかを比較します。
		boolean isEqual3 = str.equalsIgnoreCase(STR);
		System.out.println("結果 : " + isEqual3);
	}

}
