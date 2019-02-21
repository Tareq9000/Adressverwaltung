package Adressverwaltung;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	Scanner scan = new Scanner(System.in);
	Verwaltung verwaltung = new Verwaltung();

	geschlecht g = geschlecht.m�nnlich;
	

	public static void main(String[] args) {

		Test p = new Test();
		p.run();
	}

	public void run() {

		System.out.println("ADRESSVERWALTUNG\n----------------");

		int wahl = 1;

		try {									//ADRESSEN LADEN
			verwaltung.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("1 = Adressen anzeigen\n2 = Adressen hinzuf�gen\n3 = Adressen bearbeiten\n4 = Adressen l�schen\n5 = Adressverwaltung beenden");

		while (wahl == 1 || wahl == 2 || wahl == 3 || wahl == 4) {
			System.out.println("Ihre Eingabe (1, 2, 3, 4, 5) >");
			wahl = scan.nextInt();
			scan.nextLine();

			if (wahl == 1) {						 // AUSGEBEN = 1
				verwaltung.anzeigenAdresse();

			}

			else if (wahl == 2) {					 // ADRESSE HINZUF�GEN = 2
				verwaltung.hinzuf�genAdresse(add());

				try {
					verwaltung.save();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			else if (wahl == 3) { 					// ADRESSE BEARBEITEN = 3
				verwaltung.bearbeitenAdresse(add());
				
			}

			else if (wahl == 4) { 					// L�SCHEN = 4
				verwaltung.l�schenAdresse();
				try {
					verwaltung.save();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			else if (wahl == 5) { // BEENDEN = 5
				System.out.println("Adressverwaltung wird beendet");

			}
		}
	}

	public Adresse add() {

		Adresse a = new Adresse();
		
		System.out.println("Geben Sie das Geschlecht ein (m / w) >");
		char geschl = scan.next().charAt(0);
		if (geschl == 'm') {
			
		}
		if(g == geschlecht.m�nnlich) {
			
		}
		else if(g == geschlecht.weiblich) {
			
		}
		
		System.out.println("Geben Sie den Namen ein >");
		a.setName(scan.nextLine());

		System.out.println("Geben Sie dan Vornamen ein >");
		a.setVorname(scan.nextLine());

		System.out.println("Geben Sie die Strasse ein >");
		a.setStrasse(scan.nextLine());

		System.out.println("Geben Sie die Nummer ein >");
		a.setNummer(scan.nextLine());

		return a;
	}

}

// System.out.println("Geben Sie das Geschlecht ein (w / m) >");
// char geschlechte = scan.next().charAt(0);
// if (geschlechte == 'w') {
// g = geschlecht.weiblich;
// } else if (geschlechte == 'm') {
// g = geschlecht.m�nnlich;
// }
