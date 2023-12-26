package method;

public class SumLoop {

	public static void main(String[] args) {
		System.out.println("加算結果:" + sumLoop(1, 100));
	}

	private static int sumLoop(int num1, int num2) {
		System.out.println("最小値:" + num1);
		System.out.println("最大値:" + num2);
		int answer = 0;

		for (int i = num1; i <= num2; i++) {
			answer += i;
		}

		return answer;
	}
}
