package esercizi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1 {
	private static final Logger log = LoggerFactory.getLogger(Esercizio1.class);
	static int moltiplica(int first, int second) {
		return first * second;
	}

	static String concatena(String a, int b) {
		return a + b;
	}

	static String[] inserisciInArray(String[] a, String b) {
		String[] result = new String[6];

		result[0] = a[0];
		result[1] = a[1];
		result[2] = a[2];
		result[3] = b;
		result[4] = a[3];
		result[5] = a[4];
		return result;
	}

	public static void main(String[] args) {
		log.debug("ciao");
		int c = moltiplica(5, 3);
		System.out.println(c);

		String d = concatena("numero ", 3);
		System.out.println(d);

		String[] data = { "sono", "andrea", "e", "capisco", "tutto" };
		String[] g = inserisciInArray(data, "forse");
		
		for (int i = 0; i < g.length; i++)
			System.out.println(g[i]);
	}
}
