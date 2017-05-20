package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Matematica.Cubo;

public class CuboTeste {
	
	Cubo c;
	@Before
	public void setUp() throws Exception {
		c = new Cubo();
	}

	@Test
	public void testValorCubo() {
		assertEquals(27, c.valorCubo(3), 0);
	}

}
