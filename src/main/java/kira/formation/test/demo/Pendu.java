package kira.formation.test.demo;

import kira.formation.test.demo.printer.Printer;
import kira.formation.test.demo.readers.Reader;

public class Pendu {

	
	public void jouer(Printer printer, Reader reader) {
		printer.print("Entrez un mot");
		String mot = reader.readNextLine();
		String motCacher = "";
		for(int i=0; i<mot.length(); i++) {
			motCacher += "*";
		}
		printer.print(motCacher);
		printer.print("Entrez une lettre");
		String lettre = reader.readNextLine();
		int idLettre = mot.indexOf(lettre.charAt(0));
		motCacher = motCacher.substring(0, idLettre) + mot.charAt(idLettre) + motCacher.substring(idLettre+1);
		printer.print(motCacher);
		// Demande un charactere a un utilisateur
		// regarde si le caratere c est dans le mot
		// si oui change affiche le mot avec les char valides
		// recomence.
	}
}
