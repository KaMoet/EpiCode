package ecommerce;

import java.util.Arrays;

public class Carrello {
	private Cliente clienteAssociato;
	private Articolo[] elencoArticoli;
	private float costoArticoli;
	
	public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli, float costoArticoli) {
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = elencoArticoli;
		this.costoArticoli = costoArticoli;
	}

	public void stampa() {
		System.out.println("Carrello [clienteAssociato=" + clienteAssociato + ", elencoArticoli=" + Arrays.toString(elencoArticoli)
		+ ", costoArticoli=" + costoArticoli + "]");
	}
	
}
