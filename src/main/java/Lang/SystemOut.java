package Lang;

import java.io.IOException;

public class SystemOut {

	public static void main(String[] args) throws IOException {
		
		String data = "12345";
		int num =6789;
		
		// ASCIIコードで 'A', 'B', 'C' に対応するバイト配列
        byte[] byteArray = {65, 66, 67};
		
		//コンソールに表示
		System.out.print(data);
		
		//コンソールに表示後改行
		System.out.println(data);
		//%s: 文字列 (name の値が挿入される)
		//%d: 整数 (age の値が挿入される)
		//%.2f: 小数点以下2桁までの浮動小数点数 (salary の値が挿入される)
		System.out.printf("番号: %s", data);
		System.out.printf("%10d", num);
		
		// バイト配列の内容を標準出力に書き込む
		System.out.write(byteArray);
		
	}

}
