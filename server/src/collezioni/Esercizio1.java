package collezioni;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1 {
	public static final Logger log = LoggerFactory.getLogger(Esercizio1.class);

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int n = 0;
			System.out.println("numero di elementi: ");
			try {
				n = scanner.nextInt();
			} catch (InputMismatchException e) {
				log.error("errore " + e);

			}

			Set<String> parole = new HashSet<>(n);
			Set<String> duplicate = new HashSet<>();
			int cont = 0;
			for (int i = 0; i < n; i++) {
				System.out.println("inserisci parola: ");
				String str = scanner.next();
				if (!parole.add(str)) {
					duplicate.add(str);

				} else {
					cont++;
				}

			}

			System.out.println("a) parole duplicate: ");
			for (String s : duplicate) {
				System.out.println(s);
			}
			System.out.println("b)parole distinte: " + cont);
			for (String s : parole) {
				System.out.println("elenco parole distinte: "+ s);
			}
		}
	}
}
