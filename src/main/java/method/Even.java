package method;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		System.out.print(args[0]+""+args[1]);

		Scanner scanner = new Scanner(System.in);

		System.out.print("数字を入力してください: ");

		int num = scanner.nextInt();
		String result = null;
		if (checkEven(num)) {
			result = "偶数";
		} else {
			result = "奇数";
		}

		System.out.print(num + "は" + result + "です。");

		scanner.close();
	}

	private static boolean checkEven(int num) {

		boolean answer;

		if (num % 2 == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
