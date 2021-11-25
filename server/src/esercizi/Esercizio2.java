package esercizi;

public class Esercizio2 {
	public static void main(String[] args) {
		String[] s = new String[3];

		s[0] = "Buongiorno ";
		s[1] = "Grazie e ";
		s[2] = "Arrivederci ";

		System.out.println("Scrivi tre stringhe:");
		System.out.println("in ordine: " + s[0] + s[1] + s[2]);
		System.out.println("invertiti: " + s[2] + s[1] + s[0]);
	}
}