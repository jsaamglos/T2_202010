package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {

	private Modelo modelo;

	@Before
	public void setUp1() {
		modelo = new Modelo();
	}

	@Test
	public void testModelo() {
		assertTrue(modelo != null);

	}

	@Test
	public void testDarTamano() {
		assertEquals(20, modelo.darTamanoFila());
		assertEquals(20, modelo.darTamanoPila());

	}


}
