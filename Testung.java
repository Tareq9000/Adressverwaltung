package Adressverwaltung;

public class Testung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "name,vorname,weiteres";
		
		String[] array = new String[4];

		array = s.split(",");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
	}

}
