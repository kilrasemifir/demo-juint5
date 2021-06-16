package kira.formation.test.demo.readers;

import java.util.ArrayList;
import java.util.List;

public class BouchonReader implements Reader {

	List<String> liste = new ArrayList<>();
	
	public BouchonReader(List<String> liste) {
		this.liste = liste;
	}
	
	@Override
	public String readNextLine() {
		String result = liste.get(0);
		liste.remove(result);
		return result;
	}

}
