package ecommerce;

public class Articolo {

	private int codiceArticolo;
	private String descrizioneArticolo;
	private float prezzo;
	private int disponibili;

	public Articolo(int codiceArticolo, String descrizioneArticolo, float prezzo, int disponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.disponibili = disponibili;
	}

	public String toString() {
		return "Articolo [codiceArticolo=" + codiceArticolo + ", descrizioneArticolo=" + descrizioneArticolo
				+ ", prezzo=" + prezzo + ", disponibili=" + disponibili + "]";
	}
	

}
