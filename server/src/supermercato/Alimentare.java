package supermercato;

public class Alimentare extends Prodotto{
	
	public String scadenza;
	public boolean vegan;
	
	public Alimentare(int codiceUnivoco, String descrizione, double prezzo, boolean vegan) {
		super(codiceUnivoco, descrizione, prezzo);
		this.vegan = vegan;
	}

}
