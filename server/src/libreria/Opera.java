package libreria;

public abstract class Opera { 
	
	public int isbn;
	public String titolo;
	public int anno;
	public int pagine;
	
	public Opera(int isbn, String titolo, int anno, int pagine) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "Opera [isbn=" + isbn + ", titolo=" + titolo + ", anno=" + anno + ", pagine=" + pagine + "]";
	}
	
	

}