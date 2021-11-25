package eccezioni;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {
	public static void main(String[] args) {

		int[] numeri = new int[5];

		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = 1 + (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(numeri));
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < numeri.length; i++) {
				while (numeri[i] != 0) {
					System.out.println("inserisci un numero");
					int input = scanner.nextInt();
					System.out.println("inserisci la posizione tra 1 e 5");
					try {
						int position = scanner.nextInt();
						numeri[position - 1] = input;
						System.out.println(Arrays.toString(numeri));
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("posizione non valida");
					}
				}
			}
		}
	}
}
