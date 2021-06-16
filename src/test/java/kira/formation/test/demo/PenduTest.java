package kira.formation.test.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kira.formation.test.demo.printer.SpyPrinter;
import kira.formation.test.demo.readers.BouchonReader;

public class PenduTest {

	static Pendu pendu = new Pendu();
	static SpyPrinter printer = new SpyPrinter();
	@Test
	@DisplayName("Le mot rechercher a la même taille que le mot affiché")
	public void test_motCacherBonneTaille() {
		List<String> listeReponses = new ArrayList<>();
		listeReponses.add("secret");
		listeReponses.add("s");
		BouchonReader reader = new BouchonReader(listeReponses);
		pendu.jouer(printer, reader);
		System.out.println(printer.getListe());
		assertEquals("secret".length(), printer.getListe().get(1).length());
	}
	
	@Test
	@DisplayName("Si on entre une bonne lettre, alors il change les char dans le mot")
	public void test_bonChar() {
		
	}
}
