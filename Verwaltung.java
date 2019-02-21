package Adressverwaltung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Verwaltung extends Adresse {

	Scanner scan = new Scanner(System.in);
	Adresse a = new Adresse();
	List<Adresse> adressen = new ArrayList<Adresse>();
	File file = new File("adressenordner\\adresse.txt");

	geschlecht g = geschlecht.männlich;

	public void anzeigenAdresse() {
		System.out.println("Adressen\n--------");

		for (Adresse s : adressen) {
			System.out.println(s);
		}
		System.out.println("\n");
	}

	public void hinzufügenAdresse(Adresse adresse) {

		adressen.add(adresse);
	}

	public void bearbeitenAdresse(Adresse adresse) {

		System.out.println("Geben Sie die Nummer der Adresse ein >");
		int num = scan.nextInt();
	
		adressen.remove(num + 1);
		adressen.add(adresse);
	}

	public void löschenAdresse() {

		adressen.remove(adressen.size() - 1);
	}

	public void load() throws IOException {

		FileReader filer = new FileReader("adressenordner\\adresse.txt");
		BufferedReader buffer = new BufferedReader(filer);
		String[] array = new String[500];

		String s;

		while ((s = buffer.readLine()) != null) {
			
			Adresse a = new Adresse();
			
			array = s.split(",");
			a.setName(array[0]);
			a.setVorname(array[1]);
			a.setStrasse(array[2]);
			a.setNummer(array[3]);
			
			adressen.add(a);
		}
		
		buffer.close();
		filer.close();
	}

	public void save() throws IOException {

		// -----------------------------------------------------------ORDNER
		File folder = new File("adressenordner");
		if (folder.exists()) {
			System.out.println();
		} else {
			folder.mkdir();
		}

		// -----------------------------------------------------------DATEI
		if (file.exists()) {
			System.out.println();
		} else {
			file.createNewFile();
		}

		Writer writer = new FileWriter(file);

		for (Adresse a : adressen) {
			writer.write(a.toCSVLine() + "\r\n");
		}
		writer.close();
	}
}
