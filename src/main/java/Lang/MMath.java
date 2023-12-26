package Lang;

public class MMath {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = -5;
		double num3 = 5.5;
		
		//絶対値を返します。
		System.out.println("絶対値 : " + Math.abs(num2));
		
		//引数以上の最小の整数を返します。
		System.out.println("最小値 : " + Math.ceil(num3));
		
		//引数以下の最大の整数を返します。
		System.out.println("最大値 : " + Math.floor(num3));
		
		//引数の中で最大の値を返します。
		System.out.println("引数内の最大値 : " + Math.max(num1, num2));
		
		//引数の中で最小の値を返します。
		System.out.println("引数内の最小値 : " + Math.min(num1, num2));
		
		//指定された数の指定された累乗を返します。
		System.out.println("乗算 : " + Math.pow(num1, 2));
		
		//引数の平方根を返します。
		System.out.println("平方根 : " + Math.sqrt(num1));
		
		//0.0以上1.0未満の範囲の擬似乱数を返します。
		System.out.println("ランダム : " + Math.random());

	}

}
