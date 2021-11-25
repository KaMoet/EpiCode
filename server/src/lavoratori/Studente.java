package lavoratori;

class Studente extends Persona {

	private int matricolaStudente;
	private String corsoDiLaurea;
	private statoStudente statoStudente;

	public Studente(String nome, String cognome, int matricolaStudente, String corsoDiLaurea,
			statoStudente statoStudente) {
		super(nome, cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = corsoDiLaurea;
		this.statoStudente = statoStudente;
	}
	
	public String infoStudente() {
		return super.info()+"matricola: "+ this.matricolaStudente+
				", corso di laurea: "+this.corsoDiLaurea+", stato: "+ this.statoStudente;
	}

}
