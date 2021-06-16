package kira.formation.test.demo;

import kira.formation.test.demo.printer.Printer;

public class FizzBuzz {

	/**
	 * Appel la methode print du printer pour chaque entier i allant
	 * de 0 a n.
	 * Si i est multiple de 3 et de 7 alors print "fizzBuzz"
	 * Si i est multiple de 3 alors "fizz"
	 * Si i est multiple de 7 alors "buzz"
	 * Sinon i
	 * @param n
	 * @param printer
	 */
	public void fizzBuzz(int n, Printer printer) {
		for(int i=0; i<n; i++) {
			if (estMultiple(i, 21))
				printer.print("fizzBuzz");
			else if(estMultiple(i, 3))
				printer.print("fizz");
			else if(estMultiple(i, 7))
				printer.print("buzz");
			else 
				printer.print(""+i);
		}
	}

	private boolean estMultiple(int i, int multiple) {
		return i%multiple==0;
	}
}
