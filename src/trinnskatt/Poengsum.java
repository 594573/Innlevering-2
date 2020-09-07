package trinnskatt;

import javax.swing.JOptionPane;

public class Poengsum {
	String beregnKarakter(int poeng ) {
		if (poeng <0 || poeng >100) {
			System.out.println("Ugyldig verdi");
			String nypoeng = JOptionPane.showInputDialog("Antall poeng?");
			return beregnKarakter(Integer.parseInt(nypoeng)); }
		
		if (poeng >= 90) {
			return "A";
		}
		else if (poeng >= 80) {
			return "B";
		}
		else if (poeng >= 60) {
			return "C";
		}
		else if (poeng >= 50) {
			return "D";
		}
		else if (poeng >= 40) {
			return "E";
		}
		else 
		{return "F";

		}
	}
	public static void main(String[] args) {
	
		Poengsum ps = new Poengsum();
		for (int i = 0; i < 10; i++) {
			String poeng = JOptionPane.showInputDialog("Antall poeng?");
			String karakter = ps.beregnKarakter(Integer.parseInt(poeng));
			System.out.println (karakter);
		}
		
	}

}
