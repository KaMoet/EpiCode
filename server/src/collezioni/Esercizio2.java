package collezioni;

import java.util.ArrayList;
import java.util.List;

public class Esercizio2 {

	public static List<Integer> createList(int n) {
		List<Integer> result = new ArrayList<>(n);
		
		for(int i = 0; i<n;i++) {
			result.add((int)(Math.random()*101));
		}
		return result;
	}

	public static void print(List<Integer> data, boolean even) {
		for (int i = even ? 0 : 1; i < data.size(); i += 2) {
			System.out.println(data.get(i));
		}
	
	}
	public static List<Integer> reverse(List<Integer> data) {
        List<Integer> result = new ArrayList<>(data);
        for (int i = result.size() - 1; i > 0; i--) {
            result.add(result.get(i));
        }
        return result;
    }

	public static void main(String[] args) {
		
		List<Integer> response = createList(5);
		System.out.println("a) lista di interi: "+response);

		List<Integer> values = new ArrayList<>();
		values.add(5);
		values.add(4);
		System.out.println("c) valori in posizione pari: ");
		print(values, false);
		System.out.println("c) valori in posizione dispari: ");
		print(values, true);
		
		List<Integer> inversa = new ArrayList<>();
        inversa.add(5);
        inversa.add(7);
        inversa.add(9);
        inversa.add(6);
        System.out.println("lista invertita: "+reverse(inversa));
		
	}
}