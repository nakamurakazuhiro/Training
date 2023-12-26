package method;

public class Triangle {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 5;
		System.out.println("底面:" + num1);
		System.out.println("高さ:" + num2);
		System.out.println("三角形の面積:" + getTriangleAree(num1, num2));
	}

	private static int getTriangleAree(int num1, int num2) {

		return num1 * num2 / 2;

	}
}
