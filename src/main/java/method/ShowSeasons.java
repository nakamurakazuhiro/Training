package method;

import java.util.Scanner;

public class ShowSeasons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("月の数字を入力してください (1-12): ");

		int month = scanner.nextInt();

		System.out.print(month + "月は" + showSeasons(month) + "です。");

		scanner.close();
	}

	private static String showSeasons(int month) {

		String season;

		switch (month) {
		case 1, 2, 12:
			season = "冬";
			break;
		case 3, 4, 5:
			season = "春";
			break;
		case 6, 7, 8:
			season = "夏";
			break;
		case 9, 10, 11:
			season = "秋";
			break;
		default:
			season = "存在しない";
		}

		return season;

	}
}
