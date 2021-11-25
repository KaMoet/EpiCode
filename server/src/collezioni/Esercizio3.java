package collezioni;

import java.util.*;

public class Esercizio3 {
	public static void main(String[] args) {
		HashMap<String, Long> rubrica = new HashMap<String, Long>();
		try (Scanner scanner = new Scanner(System.in)) {
			putInHashMap(rubrica, scanner);
			deleteByName(rubrica, scanner);
			deleteByNumber(rubrica, scanner);
			printByName(rubrica, scanner);
			print(rubrica);

		}
	}

	public static void putInHashMap(HashMap<String, Long> hashM, Scanner scanner) {

		System.out.println("nome nuovo contatto: ");
		String name = scanner.next();
		System.out.println("numero: ");
		long num = scanner.nextLong();
		hashM.put(name, num);
	}

	public static void deleteByName(HashMap<String, Long> hashM, Scanner scanner) {

		System.out.println("nome contatto da eliminare: ");
		String nome = scanner.next();
		if (hashM.containsKey(nome)) {
			hashM.remove(nome);
		} else {
			System.out.println("il nome inserito non è presente");
		}
	}

	public static void deleteByNumber(HashMap<String, Long> hashM, Scanner scanner) {

		System.out.println("numero del contatto da eliminare: ");
		Long num = scanner.nextLong();

		if (hashM.values().remove(num)) {
			System.out.println("contatto eliminato");
		} else {
			System.out.println("il numero inserito non è presente");
		}
	}

	public static void printByName(HashMap<String, Long> hashM, Scanner scanner) {

		System.out.println("nome del contatto per vedere il numero");
		String name = scanner.next();
		if (hashM.containsKey(name)) {
			long numero = hashM.get(name);
			System.out.println("numero: " + numero);
		} else {
			System.out.println("il nome inserito non è presente\n");
		}
	}

	public static void print(HashMap<String, Long> hashM) {
		Set<Map.Entry<String, Long>> set2 = hashM.entrySet();
		for (Map.Entry<String, Long> hm : set2) {
			System.out.println(hm.getKey() + ": " + hm.getValue());

		}
	}
}
