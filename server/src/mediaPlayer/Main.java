package mediaPlayer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Audio a1 = new Audio("prova", 3, 10);
		a1.alzaVol();
		System.out.println(a1);

		Video v1 = new Video("test", 3, 8, 50);
		v1.aumentaLum();
		;
		v1.abbassaVol();
		v1.play();
		System.out.println(v1);

		Immagine i1 = new Immagine("test", 45);
		i1.diminuisciLum();
	
		System.out.println(i1);
		i1.show();

		Multimedia[] playlist = new Multimedia[5];

		try (Scanner input = new Scanner(System.in)) {
			int index = 0;
			while (index < 5) {
				System.out.println("[1 audio, 2 video, 3 immagine]?");
				int scelta = input.nextInt();
				if (scelta==1) {
					playlist[index] = new Audio("prova", 8, 5);
					index++;
				}
				else if (scelta==2) {
					playlist[index] = new Video("test", 8, 5, 5);
					index++;
				}				
				else if (scelta==3) {
					playlist[index] = new Immagine("bella", 8);
					index++;
				}
				else {
					System.out.println("???");
				}
			}
			System.out.println("!");
			boolean fatto = false;
			while (!fatto) {
				System.out.println("scegli un media: [1-5]");
				int scelta = input.nextInt();
				switch (scelta) {
				case 0:
					fatto = true;
					break;
				case 1: case 2: case 3: case 4: case 5:
					Multimedia corrente = playlist[scelta - 1];
					if (corrente instanceof Immagine) {
						Immagine immagine = (Immagine) corrente;
						immagine.show();
					} else if (corrente instanceof Riproducibile) {
						Riproducibile riproducibile = (Riproducibile) corrente;
						riproducibile.play();
					}
					break;
				default:
					System.out.println("???");
					break;
				}

			}
		}
	}
}
