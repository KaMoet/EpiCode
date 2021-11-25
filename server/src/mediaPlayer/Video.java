package mediaPlayer;

public class Video extends Riproducibile implements Luminosita{
	private int luminosita;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}

	@Override
	public String toString() {
		return "Video [luminosita=" + luminosita + " " + super.toString() + "]";
	}

	@Override
	public void aumentaLum() {
		luminosita++;
	}

	@Override
	public void diminuisciLum() {
		luminosita--;
	}
	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + " " + "!".repeat(volume)+" "+"*".repeat(luminosita));
		}
	}
}
