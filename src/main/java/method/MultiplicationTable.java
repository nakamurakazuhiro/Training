package method;

public class MultiplicationTable {

	public static void main(String[] args) {
		timesTable();
	}

	private static void timesTable() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.printf("%3d",result);
			}
			System.out.println();
		}
	}
}
