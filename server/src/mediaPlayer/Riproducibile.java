package mediaPlayer;

public class Riproducibile extends Multimedia implements Volume {
	// proprietà
	protected int durata;
	protected int volume;

	// costruttore
	public Riproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Riproducibile [durata=" + durata + ", volume=" + volume + " " + super.toString() + "]";
	}

	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + " " + "!".repeat(volume));
		}
	}

	@Override
	public void alzaVol() {
		volume++;
	}

	@Override
	public void abbassaVol() {
		volume--;
	}
}
