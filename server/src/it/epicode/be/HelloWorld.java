package it.epicode.be;

public class HelloWorld {
	
	int x;

	public static void main(String[] args) {
		
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");
		
		// Dichiaro un array
		int[] a= {12, 7};
		// Dichiaro un array bidimensionale
		int[][] b= {{12, 7}, {14, 6}};

		// dico di stampare il valore in prima pos
		System.out.println(a[0]);
		// dico di stampare il valore in seconda pos
		System.out.println(b[1]);
		// dico di stamparmi la lunghezza dell'array
		System.out.println(a.length);
		
		// definisco un oggetto
		Person person = new Person();
		person.firstName= "Tom";

	}
}

// definisco una classe
class Person{
	String firstName;
	String lastName;
	int height;
	double weight;
	boolean aged;
}



// package > classe > metodi > codice