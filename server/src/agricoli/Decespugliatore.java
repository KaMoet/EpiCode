package agricoli;

public class Decespugliatore extends Apparecchiature {
	private boolean accElettronica;

	public Decespugliatore(int ordine, String marca, String data, boolean accElettronica) {
		super(ordine, marca, data);
		this.accElettronica = accElettronica;
	}

	public String dati() {
		return ", accensione elettronica: " + this.accElettronica;
	}

}
