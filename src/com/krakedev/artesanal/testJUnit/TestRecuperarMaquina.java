package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {
 
	@Test
    public void testRecuperarExistente() {
        NegocioMejorado nm = new NegocioMejorado();
        nm.agregarMaquina("Pilsener", "Cerveza Rubia", 2.50);
        
        // Obtenemos el código de la máquina que se acaba de agregar
        String codigoGenerado = nm.getMaquinas().get(0).getCodigo();
        
        Maquina recuperada = nm.recuperarMaquina(codigoGenerado);
        assertNotNull(recuperada); // Debe encontrarla
        assertEquals("Pilsener", recuperada.getNombreCerveza());
    }

    @Test
    public void testRecuperarNoExistente() {
        NegocioMejorado nm = new NegocioMejorado();
        Maquina recuperada = nm.recuperarMaquina("M-999");
        assertNull(recuperada); // Debe retornar null
    }
}
