package kira.formation.test.demo;

import kira.formation.test.demo.printer.Printer;

public class PyramidEtoile {

	public void pyramid(int taille, Printer printer) {
		String etage = "";
		for (int i=1; i<taille+1;i++) {
			etage += "*";
			printer.print(etage);
		}
	}
}
