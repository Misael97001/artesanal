package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.krakedev.artesanal.Maquina;

public class TestVaciarJUnit {

    private Maquina maquina;

    @Before
    public void setUp() {
        maquina = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000, "ABC");
    }

    @Test
    public void testVaciarMaquina_conCerveza() {
        maquina.recargarCerveza(3000);
        maquina.vaciarMaquina();

        assertEquals(0, maquina.getCantidadActual(), 0.001);
        assertEquals(3000, maquina.getCantidadDesperdicio(), 0.001);
    }

    @Test
    public void testVaciarMaquina_sinCerveza() {
        // La máquina está vacía inicialmente

        maquina.vaciarMaquina();

        assertEquals(0, maquina.getCantidadActual(), 0.001);
        assertEquals(0, maquina.getCantidadDesperdicio(), 0.001);
    }

    @Test
    public void testVaciarMaquina_despuesDeServir() {
        maquina.recargarCerveza(4000);
        maquina.servirCerveza(1500);

        maquina.vaciarMaquina();

        assertEquals(0, maquina.getCantidadActual(), 0.001);
        assertEquals(2500, maquina.getCantidadDesperdicio(), 0.001);
    }
}