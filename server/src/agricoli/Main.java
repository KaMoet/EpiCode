package agricoli;

public class Main {
	public static void main(String[] args) {
		Decespugliatore d1 = new Decespugliatore(2222, "Worx", "23/07/20", true);
		System.out.println(d1.datiOrdine() + d1.dati());
		Motozappa m1 = new Motozappa(3333, "Biggs", "30/06/20", 4, 6);
		System.out.println(m1.datiOrdine() + m1.dati());

	}
}
