package eccezioni;

import java.util.Scanner;

public class Esercizio2 {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("inserisci i kilometri:");
			try {
				double kilometri = Integer.valueOf(scan.nextLine());
				System.out.println("inserisci i litri");
				double litri = Integer.valueOf(scan.nextLine());
				if (litri ==0) {
					System.out.println("non puoi guidare senza carburante");
				}
				else {
				System.out.println("percorri mediamente " + kilometri / litri + " km con 1 litro di carburante");
				}
			} catch (ArithmeticException ae) {
				System.out.println("i litri non possono essere 0");
			} catch (NumberFormatException e) {
				System.out.println("accetto solo numeri");
			}
		}
	}
}