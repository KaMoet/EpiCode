package mediaPlayer;

public abstract class Multimedia {
	
	private String titolo;

	public Multimedia(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Multimedia [titolo=" + getTitolo() + "]";
	}

	public String getTitolo() {
		return titolo;
	}

}
