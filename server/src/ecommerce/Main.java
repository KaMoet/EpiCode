package ecommerce;

public class Main {

	public static void main(String[] args) {
		
		Cliente n1 = new Cliente(666, "Mario", "mario@mail.it", "30/03/1991");
		Articolo a1 = new Articolo(123, "birra", 0.78f, 33);
		Articolo a2 = new Articolo(456, "vino", 5.34f, 22);
		Articolo[] elencoArticoli = new Articolo[2];
		elencoArticoli[0] = a1;
		elencoArticoli[1] = a2;
		
		Carrello cart = new Carrello (n1, elencoArticoli, 7.5f);
		cart.stampa();
	}
}
