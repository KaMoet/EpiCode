package cicli;

public class Switch {
	public static void proviamo(int x) {
		switch (x) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("il numeno non è compreso tra 0 e 3");
		}
	}

	public static void main(String[] args) {
		int value = 0;
		proviamo(value);

	}
}
