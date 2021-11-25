package banca;

public class OnLine extends ContoCorrente{
	double maxPrelievo;

	public OnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {
		System.out.println("titolare: " + titolare + "\n saldo: " + saldo + "\n movimenti " + nMovimenti
				+ "\n max movimenti: " + MAX_MOVIMENTI + "prelievo massimo: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x <= maxPrelievo) {
			super.preleva(x);
		} else {
			throw new BancaException("non disponibile");
		}
	}

}
