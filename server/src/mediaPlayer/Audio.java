package mediaPlayer;

public class Audio extends Riproducibile{

	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);		
	}

	@Override
	public String toString() {
		return "Audio [" + super.toString() + "]";
	}
}
