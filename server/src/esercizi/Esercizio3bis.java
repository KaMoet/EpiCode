package esercizi;

public class Esercizio3bis {

	static int pariDispari (int numero) {
		if (numero%2 == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		int x = pariDispari(6);
		System.out.println(x);
	}
}
