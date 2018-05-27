package Operater;

import javax.swing.JOptionPane;

public class Oduzimanje {
	public static void main(String[] args) {
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite jedan broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		int rezultat = prviBroj - drugiBroj;
		
		System.out.print(prviBroj + " - ");
		System.out.print(drugiBroj);
		System.out.print(" = " + rezultat);
		
		
	}

}
