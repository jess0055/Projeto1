package Teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import Matematica.Area;
import Matematica.Calculadora;
import static org.mockito.Mockito.when;


public class AreaTest {
	
	private Area area;	
	@Mock
	private Calculadora mockCalc;
	
	@Before
	public void setUp() throws Exception {	
		MockitoAnnotations.initMocks(this);
		when(mockCalc.multiplicacao(10,9)).thenReturn(90.0);
		when(mockCalc.divisao(90,2)).thenReturn(45.0);
		area = new Area(mockCalc);
	}

	@Test
	public void testTriangulo() {	
		assertEquals(45.0, area.Triangulo(10,9), 0);
	}

}
