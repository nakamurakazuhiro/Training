package method;

public class Circle {

	public static void main(String[] args) {
		double num = 5.0;
		System.out.println("半径:" + num);
		System.out.println("円の面積:" + getCircleAree(num));
	}
	
	private static double getCircleAree(double num) {
		
		return num * num * 3.14;
		
	}
}
