package kira.formation.test.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

	Calculatrice calculatrice = new Calculatrice();
	
	@Test
	@DisplayName("Addition avec des nombres positifs")
	public void test_addition_positif() {
		double result = calculatrice.addition(5,  4);
		assertEquals(9, result);
	}
	
	@Test
	@DisplayName("Addition avec des nombres negatifs")
	public void test_addition_negatif() {
		double result = calculatrice.addition(-1, -17);
		assertEquals(-18, result);
	}
	
	@Test
	@DisplayName("Multiplication avec des nombres positifs")
	public void test_multiplication_positif() {
		double result = calculatrice.multiplication(5,  4);
		assertEquals(20, result);
	}
}
