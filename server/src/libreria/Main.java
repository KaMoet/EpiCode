package libreria;

public class Main {

	public static void main(String[] args) {
		Archivio archivio = new Archivio();
		
		Opera opera = new Libro(333, "Bello", 1991, 300, "Andrea P.", "Fantasy");
		archivio.add(opera);
		archivio.searchISBN(333);
		archivio.removeByISBN(333);
		System.out.println(archivio);
		
		Opera opera2 = new Libro (222, "Bravo", 1989, 400, "Tania S.", "Horror");
		archivio.add(opera2);
		archivio.searchAutore("Tania S.");
		System.out.println(archivio);
	}

}