package lavoratori;

public class Main {
	public static void main(String[] args) {
		Studente s1=new Studente("Andrea", "Passaglia",5567, "Scienze Naturali", statoStudente.INTERROTTO);
		System.out.println(s1.infoStudente()); 
		
		Lavoratore l1=new Lavoratore("Mario", "Rossi", 5567, "Pangnomo","30/06/98", statoLavoratore.IN_FERIE);
		System.out.println(l1.infoLavoratore()); 
	}
}