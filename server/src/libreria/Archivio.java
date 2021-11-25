package libreria;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class Archivio {

	private List<Opera> opere;
	private File file;
	
	public Archivio() {
		this.opere = new ArrayList<>();
	}
	
	public void add(Opera opera) {
		opere.add(opera);
	}
	
	public void removeByISBN(int isbn) {
		opere = opere.stream().filter((opera)-> {
            return opera.getIsbn()!=(isbn);
        }).collect(Collectors.toList());
	}
	
	public List<Opera> searchISBN(int isbn){
		return opere.stream().filter(opera -> opera.getIsbn()!=(isbn)).collect(Collectors.toList());
	}
	public List<Opera> searchAnno(int anno){
		return opere.stream().filter(opera -> opera.getAnno()!=(anno)).collect(Collectors.toList());
	}
	public List<Opera> searchAutore(String name) {
        List<Opera> result = opere.stream().filter(element -> element instanceof Libro)
                .filter(opere -> ((Libro) opere).getAutore().equals(name)).collect(Collectors.toList());
        return result;
    }
	
	public void writeFile() {

		StringBuilder fileWrite = new StringBuilder();
		String s = "";
		for (Opera p : opere) {
			s += "Codice ISBN: " + p.getIsbn() + " Anno pubblicazione " + p.getAnno()
					+ " Numero pagine: " + p.getPagine() + " Titolo: " + p.getTitolo();
			if (p instanceof Libro) {
				s += " Autore: " + ((Libro) p).getAutore() + " Genere: " + ((Libro) p).getGenere() + "\n";
			}
			if (p instanceof Rivista) {
				s += " Periodicità: " + ((Rivista) p).getPeriodicita() + "\n";
			}
		}
		
		fileWrite.append(s);
		try {
			FileUtils.writeStringToFile(file, fileWrite.toString(), "UTF-8");
		} catch (IOException e) {
			System.out.println("Error " + e);
		}
	}

	public void readFile() {

		try {
			String read = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(read);

		} catch (IOException e) {
			System.out.println("Error " + e);
		}

	}
	
	@Override
	public String toString() {
		return "Archivio [opere=" + opere + "]";
	}
	
	
}