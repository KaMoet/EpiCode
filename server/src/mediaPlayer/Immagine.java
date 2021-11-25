package mediaPlayer;

public class Immagine extends Multimedia implements Luminosita{
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	@Override
	public String toString() {
		return "Immagine [luminosita=" + luminosita + " " + super.toString() + "]";
	}
	
	public void show() {
		System.out.println(getTitolo()+" "+"*".repeat(luminosita));
	}

	@Override
	public void aumentaLum() {
		luminosita++;
	}

	@Override
	public void diminuisciLum() {
		luminosita--;
	}
}
