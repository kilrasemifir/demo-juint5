package kira.formation.test.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kira.formation.test.demo.printer.SpyPrinter;

public class FizzBuzzTest {

	static FizzBuzz fizzBuzz = new FizzBuzz();
	static SpyPrinter printer = new SpyPrinter();
	
	@BeforeAll
	public static void before() {
		fizzBuzz.fizzBuzz(100, printer);
	}
	
	@Test
	@DisplayName("FizzBuzz print n sortie.")
	public void test_printNValeurs() {
		assertEquals(100, printer.getListe().size());
	}
	
	@Test
	@DisplayName("Les nombres multiples de 3 et 7 print fizzBuzz")
	public void test_multipleDe3Et7PrintFizzBuzz() {
		assertEquals("fizzBuzz", printer.getListe().get(42));
	}
	
	@Test
	@DisplayName("Les nombres multiples de 3 print fizz")
	public void test_multipleDe3PrintFizz() {
		assertEquals("fizz", printer.getListe().get(6));
	}
	
	@Test
	@DisplayName("Les nombres multiples de 7 print buzz")
	public void test_multipleDe7PrintBuzz() {
		assertEquals("buzz", printer.getListe().get(14));
	}
	
	@Test

	@DisplayName("Les nombres non multiples de 3 ou 7 s'affichent eux même")
	public void test_nonMultipleDe3Et7PrintI() {
		assertEquals("2", printer.getListe().get(2));
	}
}
