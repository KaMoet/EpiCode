package cicli;

public class Ifelseif {
	public static boolean stringaPariDispari(String s) {
		if (s.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int y) {
		if ((y % 400 == 0 || (y %4 ==0 && !(y%100==0)))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean x = stringaPariDispari("ossesso");
		System.out.println(x);
		boolean a = annoBisestile (2024);
		System.out.println(a);
	}

}
