package esercizi;

public class Esercizio3 {

	static double perimetroRettangolo(double a, double b) {
		return (a * 2) + (b * 2);
	}

	static int pariDispari(int num) {
		//se è pari stampa 0 altrimenti 1
		return num % 2;
	}

	static double areaTriangolo(double lato1, double lato2, double lato3) {
		// formula di Erone
		double p = (lato1 + lato2 + lato3) / 2;
		double area = Math.sqrt(p*(p-lato1)*(p-lato2)*(p-lato3));
		return area;
	}

	public static void main(String[] args) {

		double c = perimetroRettangolo(5.10, 7.50);
		System.out.println("il perimetro è: " + c);

		int e = pariDispari(7);
		System.out.println("il numero è: " + e);

		double area = areaTriangolo(6.10, 8.30, 4.50);
		System.out.println("l'area è: " + area);
	}
}
