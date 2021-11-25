package presenze;

public class Main {

	public static void main(String[] args) {
		Registro elenco = new Registro();
		elenco.add("Andrea", 3);
		elenco.add("Tania", 11);
		elenco.add("Vania", 9);
		
		elenco.save();
		elenco.readf();
	}
}
