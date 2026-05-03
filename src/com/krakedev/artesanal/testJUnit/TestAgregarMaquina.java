package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

	@Test
    public void testAgregarMaquinaExitoso() {
        NegocioMejorado nm = new NegocioMejorado();
        
        // Al estar la lista vacía, la primera inserción debe ser true
        boolean resultado = nm.agregarMaquina("Pilsener", "Cerveza Rubia", 2.50);
        
        assertTrue(resultado); 
        assertEquals(1, nm.getMaquinas().size()); // Verifica que el tamaño aumentó[cite: 1]
    }

    @Test
    public void testValidarAtributosAgregados() {
        NegocioMejorado nm = new NegocioMejorado();
        nm.agregarMaquina("Club", "Cerveza Premium", 3.00);
        
        // Recuperamos la máquina para verificar que los datos coincidan[cite: 1]
        Maquina m = nm.getMaquinas().get(0);
        
        assertNotNull(m.getCodigo()); // El código no debe ser nulo[cite: 1]
        assertEquals("Club", m.getNombreCerveza());
        assertEquals(3.00, m.getPrecioPorMl(), 0.01);
    }
}
