package thread;

public class Main {
	public static void main(String[] args) {

		Thread thread1 = new MyThread();
		thread1.setName("#");
		thread1.start();

		Thread thread2 = new MyThread();
		thread2.setName("*");
		thread2.start();
		
	}
}