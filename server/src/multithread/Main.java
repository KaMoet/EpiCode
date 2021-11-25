package multithread;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		int[] elenco = new int[3000];
		for (int i = 0; i < elenco.length; i++) {
			elenco[i] = 1 + (int) (Math.random() * 1000);
		}

		int[] a1 = Arrays.copyOfRange(elenco, 0, 999);
		int[] a2 = Arrays.copyOfRange(elenco, 1000, 1999);
		int[] a3 = Arrays.copyOfRange(elenco, 2000, 2999);

		ArrayAdder r1 = new ArrayAdder("thread1: ", a1);
		Thread t1 = new Thread(r1);
		t1.start();
		ArrayAdder r2 = new ArrayAdder("thread2: ", a2);
		Thread t2 = new Thread(r2);
		t2.start();
		ArrayAdder r3 = new ArrayAdder("thread3: ", a3);
		Thread t3 = new Thread(r3);
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			log.error("errore: " + e);
		}

		long somma = r1.getCont() + r1.getCont() + r3.getCont();
		System.out.println("somma dei 3k numeri: " + somma);
	}
}