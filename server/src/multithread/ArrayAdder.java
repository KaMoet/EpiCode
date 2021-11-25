package multithread;

public class ArrayAdder implements Runnable {

	private String name;
	private int[] elenco = new int[1000];
	private long cont;

	public ArrayAdder(String name, int[] array) {
		this.elenco = array;
		this.name = name;
		this.cont = 0;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 0; i < elenco.length; i++) {
			cont += elenco[i];
		}
		System.out.println("somma di " + name + " " + cont);
	}

	public long getCont() {
		return cont;
	}
}