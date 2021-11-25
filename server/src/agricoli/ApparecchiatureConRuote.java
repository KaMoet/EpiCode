package agricoli;

public abstract class ApparecchiatureConRuote extends Apparecchiature {
	private int numRuote;

	public ApparecchiatureConRuote(int ordine, String marca, String data, int numRuote) {
		super(ordine, marca, data);
		this.numRuote = numRuote;
	}

	public int getNumRuote() {
		return numRuote;
	}

	public void setNumRuote(int numRuote) {
		this.numRuote = numRuote;
	}

}
