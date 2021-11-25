package ecommerce;

public class Cliente {
	private int codiceCliente;
	private String generalit‡, email, dataIscrizione;
	
	public Cliente(int codiceCliente, String generalit‡, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.generalit‡ = generalit‡;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}

	public String toString() {
		return "Cliente [codiceCliente=" + codiceCliente + ", generalit√†=" + generalit‡ + ", email=" + email
				+ ", dataIscrizione=" + dataIscrizione + "]";
	} 

}
