package kira.formation.test.demo.printer;

import java.util.ArrayList;
import java.util.List;

public class SpyPrinter implements Printer {

	List<String> liste = new ArrayList<>();
	@Override
	public void print(String message) {
		liste.add(message);
	}
	
	public List<String> getListe() {
		return liste;
	}
	
}
