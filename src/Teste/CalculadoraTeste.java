package Teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Matematica.Calculadora;

public class CalculadoraTeste {
	
	Calculadora c;
	@Before
	public void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	public void testSoma() {
		assertEquals(4, c.soma(2, 2), 0);
	}

	@Test
	public void testDivisao() {
		assertEquals(7, c.divisao(8, 2), 0);
	}
	
	@Test
	public void testDivisaoString() {
		assertEquals(40, c.divisao(80, 2), 0);
	}
	
	@Test
	public void testDivisao80Por2() {
		assertEquals(45, c.divisao(80, 2), 0);
	}

}
