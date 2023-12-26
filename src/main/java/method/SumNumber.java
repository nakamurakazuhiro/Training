package method;

public class SumNumber {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		System.out.println("1つ目の引数:" + num1);
		System.out.println("2つ目の引数:" + num2);
		System.out.println("加算結果:" + calculastSum(num1, num2));
	}
	
	private static int calculastSum(int num1, int num2) {
		
		return num1 + num2;
		
	}
}
