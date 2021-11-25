package presenze;

public class Presenza {
	private String nome;
	private int presenze;

	public Presenza(String nome, int presenze) {
		this.nome = nome;
		this.presenze = presenze;
	}

	@Override
	public String toString() {
		return nome + "@" + presenze+"\n";
	}

}
