package supermercato;

public class Main {
	public static void main(String[] args) {
		Alimentare a1 = new Alimentare (1111, "pane", 1.9, true);
		System.out.println(a1.datiProdotto());
		
		Merceologia m1 = new Merceologia ("ferramenta", 0202); 
		NonAlimentare n1 = new NonAlimentare (2222, "chiodi", 1.7, m1);
		System.out.println(m1.dati()+n1.datiProdotto());
	}
}