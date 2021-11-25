package banca;

public class ContoCorrente {
	protected String titolare;
	protected int nMovimenti;
	protected final int MAX_MOVIMENTI = 50;
	protected double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		this.nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		if (nMovimenti < MAX_MOVIMENTI) {
			saldo = saldo - x;
		} else {
			saldo = saldo - x - 0.50;
		}

		nMovimenti++;

		if (saldo < 0) {
			throw new BancaException("sei in rosso");
		}
	}

	double restituisciSaldo() {
		return saldo;
	}

}
