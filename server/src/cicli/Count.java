package cicli;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("scrivi un numero:");
			int number = scan.nextInt();
			down(number);
		}
	}

	public static void down(int x) {
		for (; x >= 0; x--) {
			System.out.println(x);
		}
	}
}
