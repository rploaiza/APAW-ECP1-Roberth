package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpresionTest {

	@Test
	public void testSuma() {
		Expresion expresion = new Suma();
		int c = expresion.exprecion(2, 2);
		assertEquals(4, c);
	}

	@Test
	public void testMultiplicacion() {
		Expresion expresion = new Multiplicacion();
		int c = expresion.exprecion(3, 2);
		assertEquals(6, c);
	}

	@Test
	public void testResta() {
		Expresion expresion = new Resta();
		int c = expresion.exprecion(3, 2);
		assertEquals(1, c);
	}

	@Test
	public void testDivision() {
		Expresion expresion = new Division();
		int c = expresion.exprecion(6, 2);
		assertEquals(3, c);
	}

	@Test
	public void testDivisionReturn0() {
		Expresion expresion = new Division();
		int c = expresion.exprecion(6, 0);
		assertEquals(0, c);
	}
}
