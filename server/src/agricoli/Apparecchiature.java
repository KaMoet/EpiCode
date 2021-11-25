package agricoli;

public abstract class Apparecchiature {
	private int ordine;
	private String marca;
	private String data;

	public Apparecchiature(int ordine, String marca, String data) {
		super();
		this.ordine = ordine;
		this.marca = marca;
		this.data = data;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	public String getMarca() {
		return marca;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String datiOrdine() {
		return "numero: " + this.ordine + ", marca: " + this.marca + ", data: " + this.data;
	}

}
