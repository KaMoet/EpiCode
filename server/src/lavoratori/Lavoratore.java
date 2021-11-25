package lavoratori;

class Lavoratore extends Persona {

	private int matricolaLavoratore;
	private String azienda;
	private String dataAssunzione;
	private statoLavoratore statoLavoratore;

	public Lavoratore(String nome, String cognome, int matricolaLavoratore, String azienda,String dataAssunzione,
			statoLavoratore statoLavoratore) {
		super(nome, cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione= dataAssunzione;
		this.statoLavoratore = statoLavoratore;
	}
	
	public String infoLavoratore() {
		return super.info()+"matricola: "+ this.matricolaLavoratore+
				", azienda: "+this.azienda+", data assunzione:"+this.dataAssunzione+", stato: "+ this.statoLavoratore;
	}

}
