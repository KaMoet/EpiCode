package dipendenti;

public class Dipendente {

	// definisco gli attributi
	private static final int STIPENDIOBASE = 1000;
	private int matricola;
	private double stipendio;
	private int importoOrarioStraordinario;

	// creo due enumeratori e li definisco
	private Livello livello;
	private Dipartimento dipartimento;

	// creo il primo costruttore da source
	public Dipendente(int matricola, double stipendio, int importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}

	// creo il secondo costruttore come da esercizio
	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = STIPENDIOBASE;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}

	// stampo tutti i dati del dipendente
	public void stampaDatiDipendente() {
		System.out.println("matricola: " + this.matricola);
		System.out.println("stipendio: " + this.stipendio);
		System.out.println("straordinario: " + this.importoOrarioStraordinario);
		System.out.println("livello: " + this.livello);
		System.out.println("dipartimento: " + this.dipartimento);
		System.out.println("----------------");
	}

	// get&set come da esercizio tramite source
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(int importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public static int getStipendiobase() {
		return STIPENDIOBASE;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLivello() {
		return livello;
	}

	// creo il metodo di promozione
	public Livello promuovi() {

		if (this.livello == Livello.OPERAIO) {
			this.livello = Livello.IMPIEGATO;
			this.stipendio = STIPENDIOBASE * 1.2;
		} else if (this.livello == Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			this.stipendio = STIPENDIOBASE * 1.5;
		} else if (this.livello == Livello.QUADRO) {
			this.livello = Livello.DIRIGENTE;
			this.stipendio = STIPENDIOBASE * 2;
		} else if (this.livello == Livello.DIRIGENTE) {
			System.out.println("sei al livello più alto");
		}
		System.out.println("\n" + matricola + " promosso a: " + livello + "!");
		System.out.println("----------------");
		return this.livello;
	}

	// creo due metodi statici
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}

	public static double calcolaPaga(Dipendente dipendente, int ore) {
		return dipendente.getStipendio() + (ore * dipendente.getImportoOrarioStraordinario());
	}

	// main
	public static void main(String[] args) {

		// creo un array di 4 dipendenti e gli passo gli attributi
		Dipendente[] dipendenti = new Dipendente[4];
		dipendenti[0] = new Dipendente(3003, 900, 10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		dipendenti[1] = new Dipendente(2901, 900, 11, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		dipendenti[2] = new Dipendente(1611, 1100, 8, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		dipendenti[3] = new Dipendente(1606, 1800, 2, Livello.DIRIGENTE, Dipartimento.VENDITE);

		// promuovo i due dipendenti
		dipendenti[0].promuovi();
		dipendenti[2].promuovi();

		// stampo lo stato dei dipendenti
		for (int i = 0; i < dipendenti.length; i++) {
			dipendenti[i].stampaDatiDipendente();
		}

		// stampo la somma degli stipendi dei dipendenti
		double sommaStipendi = 0;
		for (int i = 0; i < dipendenti.length; i++) {
			sommaStipendi += calcolaPaga(dipendenti[i], 5);
		}
		System.out.println("\nil TOTALE degli stipendi è: " + sommaStipendi);

	}
}
