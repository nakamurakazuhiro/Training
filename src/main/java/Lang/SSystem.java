package Lang;

import java.util.Arrays;

public class SSystem {

	public static void main(String[] args) {
		//システムの現在の時間（エポックからのミリ秒数）を返します。
		long currentTime = System.currentTimeMillis();
		System.out.println("ミリ秒数 : " + currentTime);

		//システムの現在の時間（エポックからのナノ秒数）を返します
		long nanoTime = System.nanoTime();
		System.out.println("ナノ秒数 : " + nanoTime);

		//システムプロパティの値を取得します。
		String javaVersion = System.getProperty("java.version");
		System.out.println("javaのバージョン : " + javaVersion);

		//システムの環境変数の値を取得します。
		String homeDirectory = System.getenv("HOME");
		System.out.println("システムの環境変数 : " + homeDirectory);

		// 配列の一部を別の配列にコピーします。
		int[] sourceArray = { 1, 2, 3, 4, 5 };

		int[] destinationArray = new int[sourceArray.length - 1];

		System.arraycopy(sourceArray, 1, destinationArray, 0, sourceArray.length - 1);

		System.out.print("Source Array: ");
		System.out.println(Arrays.toString(sourceArray));

		System.out.print("Copied Array: ");
		System.out.println(Arrays.toString(destinationArray));
		
		// ガベージコレクタがメモリ内の不要なオブジェクトを解放するように試みます。
		//ただし、Javaプログラムでは通常、ガベージコレクションを積極的に制御する必要はありません。
        System.gc();
		
		
		
		

		//プログラムを終了します。
		System.exit(0);
		System.out.println("終了(表示されない)");

	}

}
