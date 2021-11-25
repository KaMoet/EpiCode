package chiamata;

import java.util.Arrays;

public class Sim {
	
	private int numero;
	private float credito;
	
	private Chiamata[] chiamate;
	
	public Sim(int numero) {
		this.numero = numero;
		this.credito = 0;
		for (int i = 0; i < 6; i++) {
            this.chiamate = new Chiamata[i];
        }
	}

	public String stampa(){
		return "Sim [numero=" + numero + ", credito=" + credito + 
				", chiamate=" + Arrays.toString(chiamate) + "]";
	}
	
}