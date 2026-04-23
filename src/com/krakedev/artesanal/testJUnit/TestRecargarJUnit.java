package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {
	
	@Test
	public void testRecargaExitosa() {
		Maquina rubia= new Maquina("Pilsener", "cerveza fria", 0.02, 8000,"ABC");
    	
		boolean resultado=rubia.recargarCerveza(3000);
		assertTrue(resultado);
		assertEquals(3000, rubia.getCantidadActual(),0.001);
	}
	
	@Test
	public void testRecargaFallidaPorDesbordo() {
		Maquina negra= new Maquina("Club", "cerveza fria", 0.03, 8000,"ABC");
		boolean resultado=negra.recargarCerveza(7000);
		
		assertTrue(resultado);
		assertEquals(7000, negra.getCantidadActual(),0.001);
	}

}
