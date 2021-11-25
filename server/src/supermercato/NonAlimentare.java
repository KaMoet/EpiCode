package supermercato;

public class NonAlimentare extends Prodotto {

	Merceologia merceologia;

	public NonAlimentare(int codiceUnivoco, String descrizione, double prezzo, Merceologia merceologia) {
		super(codiceUnivoco, descrizione, prezzo);
		this.merceologia = merceologia;
	}

}
