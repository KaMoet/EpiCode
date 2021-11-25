package libreria;

public class Libro extends Opera{
	
	private String autore;
	private String genere;
	
	public Libro(int isbn, String titolo, int anno, int pagine, String autore, String genere) {
		super(isbn, titolo, anno, pagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", " + super.toString() + "]";
	}
	
	
}
