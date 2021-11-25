package presenze;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;

public class Registro {
	private ArrayList<Presenza> presenze = new ArrayList<>();
	private File file = new File(".presenze.txt");

	public void save() {
		try {
			StringBuilder fileWrite = new StringBuilder();
			for (Presenza p : presenze) {
				fileWrite.append(p.toString());
			}
			FileUtils.writeStringToFile(file, fileWrite.toString(),"UTF-8");
		} catch (IOException e) {
			System.out.println("error " + e);
		}
	}
	public void add(String nome, int presenze) {
		Presenza presenza = new Presenza(nome, presenze);
		this.presenze.add(presenza);
	}

	public void readf() {
		try {
			String read = FileUtils.readFileToString(file, "UTF-8");
			String[] split =read.split("#");
			for(String s :split) {
				System.out.println(s);
			}
		}catch(IOException e){
			System.out.println("error"+ e);
		}
	}

}
