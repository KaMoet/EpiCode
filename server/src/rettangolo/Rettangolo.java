package rettangolo;

public class Rettangolo {

	private double h;
	private double l;

	public Rettangolo(double h, double l) {
		this.h = h;
		this.l = l;
	}

	public double perimetro() {
		double perimetro = (l * 2) + (h * 2);
		return perimetro;
	}

	public double area() {
		double area = (l * h);
		return area;
	}
	
	//MAIN
	public static void main(String args[]) {

		Rettangolo r1 = new Rettangolo(8, 6);
		stampaRettangolo(r1);
		
		Rettangolo r2 = new Rettangolo(5, 4);
		Rettangolo r3 = new Rettangolo(7, 9);
		stampaDueRettangoli(r2, r3);

	}

	public static void stampaRettangolo(Rettangolo r) {
		double perimetro = r.perimetro();
		double area = r.area();
		System.out.println("il perimetro è: " + perimetro);
		System.out.println("l'area è: " + area);
	}

	public static void stampaDueRettangoli(Rettangolo s, Rettangolo t) {
		double perimetro1 = s.perimetro();
		double perimetro2 = t.perimetro();
		System.out.println("il perimetro del primo è: " + perimetro1);
		System.out.println("il perimetro del secondo è: " + perimetro2);
		System.out.println("la somma è: " + (perimetro1 + perimetro2));

		double area1 = s.area();
		double area2 = t.area();
		System.out.println("l'area del primo è: " + area1);
		System.out.println("l'area del secondo è: " + area2);
		System.out.println("la somma è: " + (area1 + area2));

	}
}