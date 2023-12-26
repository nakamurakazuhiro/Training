package method;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int evenCount = getEvenCount(numbers);

		System.out.println(Arrays.toString(numbers) + "には、偶数が" + evenCount + "個あります。");
	}
	
	private static int getEvenCount(int[] array) {
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
