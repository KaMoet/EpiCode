package supermercato;

public class Merceologia {
	private String nome;
	private int codice;

	public Merceologia(String nome, int codice) {
		this.nome = nome;
		this.codice = codice;
	}
	
	public String dati() {
		return "reparto: "+nome+ ", codice: "+ this.codice+"\n";
	}
	
}
