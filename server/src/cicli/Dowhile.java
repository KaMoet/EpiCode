package cicli;

import java.util.Scanner;

public class Dowhile {
	public static void comma(String x) {
		int i = 0;
		while (i < x.length()) {
			System.out.print(x.charAt(i) + ",");
			i = i + 1;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("inserire una Stringa:");
			String value = scan.nextLine();
			if (value.equals(":q")) {
				System.out.println("Fine");
				break;
			} else {
				comma(value);
			}
		}

		scan.close();

	}
}