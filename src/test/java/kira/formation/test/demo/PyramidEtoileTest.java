package kira.formation.test.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import kira.formation.test.demo.printer.SpyPrinter;

public class PyramidEtoileTest {

	PyramidEtoile p = new PyramidEtoile();
	
	@Test
	public void test_pyramid() {
		SpyPrinter printer = new SpyPrinter();
		p.pyramid(5, printer);
		List<String> etages = printer.getListe();
		int taille = 1;
		for (String etage: etages) {
			assertEquals(taille, etage.length());
			taille++;
		}	
	}
	
	@Test
	public void test_pyramid_tailleDernierEtage() {
		SpyPrinter printer = new SpyPrinter();
		p.pyramid(5, printer);
		List<String> etages = printer.getListe();
		String dernierEtage = etages.get(etages.size()-1);
		assertEquals(5, dernierEtage.length());
	}
}
