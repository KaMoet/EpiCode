package agricoli;

public class Motozappa extends ApparecchiatureConRuote {
	private int numFrese;

	public Motozappa(int ordine, String marca, String data, int numRuote, int numFrese) {
		super(ordine, marca, data, numRuote);
		this.numFrese = numFrese;
	}

	public String dati() {
		return ", ruote: " + this.getNumRuote() + ", frese: " + this.numFrese;
	}
	
}
