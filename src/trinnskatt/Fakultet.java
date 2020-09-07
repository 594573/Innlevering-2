package trinnskatt;

import javax.swing.JOptionPane;

public class Fakultet {

	public static void main(String[] args) {  
		int sum = 1;
		String n = JOptionPane.showInputDialog("Skriv inn tall");
			for	(int i = 1; i <= Integer.parseInt(n); i++) {
				sum = (sum * i);
			}
			System.out.println(sum);
	}
	
}
