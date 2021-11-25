package lavoratori;

public class Persona {
	public String nome;
	public String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String info() {
		return (nome+" "+cognome+"; ");
	}
}
