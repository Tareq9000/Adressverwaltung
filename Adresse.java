package Adressverwaltung;

class Adresse {

	String name;
	String vorname;
	String strasse;
	String nummer;

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getAdresse() {
		return strasse;
	}

	public String getNummer() {
		return nummer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	public String toString() {
		
		return "Name:"+name + "  Vorname:" +vorname+ "  Strasse:" +strasse+ " " +nummer;
	}
	public String toCSVLine() {
		
		return name + "," +vorname+ "," +strasse+ "," +nummer;
	}
}
