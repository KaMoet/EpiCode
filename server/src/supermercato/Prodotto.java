package supermercato;

public abstract class Prodotto {
	private int codiceUnivoco;
	private String descrizione;
	private double prezzo;

	public Prodotto(int codiceUnivoco, String descrizione, double prezzo) {
		this.codiceUnivoco = codiceUnivoco;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public void setCodiceUnivoco(int codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void applicaSconto() {
		double sconto = (prezzo - ((prezzo%100)*5));
		this.prezzo=sconto;
	}
	
	public String datiProdotto() {
			return "codice: "+codiceUnivoco+ ", descrizione: "+ this.descrizione+
					", prezzo: "+this.prezzo;
		}
	}

