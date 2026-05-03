package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigoJUnit {

	@Test
	public void testGenerarCodigo() {
	    NegocioMejorado nm = new NegocioMejorado();
	    String codigo = nm.generarCodigo();
	    assertNotNull(codigo);
	    assertTrue(codigo.startsWith("M-"));
	}
}
