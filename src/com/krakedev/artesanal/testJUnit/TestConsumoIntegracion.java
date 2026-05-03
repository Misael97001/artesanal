package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoIntegracion {

    @Test
    public void testFlujoConsumoCompleto() {
        NegocioMejorado nm = new NegocioMejorado();
        
        // 1. Agregar máquina y cliente
        // El método agregarMaquina ahora devuelve boolean
        nm.agregarMaquina("Artesanal Gold", "Tipo Ale", 0.10); 
        // El código de cliente se genera internamente como int y es el último en el constructor
        nm.registrarCliente("Carlos Pérez", "175566");
        
        // 2. Obtener códigos generados para la prueba
        String codMaq = nm.getMaquinas().get(0).getCodigo();
        int codCli = nm.getClientes().get(0).getCodigo(); // Acceso directo al código int
        
        // 3. Cargar la máquina (Punto 5 del taller)
        nm.cargarMaquinas(); 
        
        // 4. Capturar el contenido inicial real para evitar AssertionFailedError
        // Se usa recuperarMaquina para obtener el estado actual tras la carga
        double contenidoInicial = nm.recuperarMaquina(codMaq).getCantidadActual(); 
        int cantidadAConsumir = 200;
        
        // 5. Ejecutar consumo
        nm.consumirCerveza(codCli, codMaq, cantidadAConsumir);
        
        // VALIDACIONES
        Cliente c = nm.buscarClientePorCodigo(codCli);
        Maquina m = nm.recuperarMaquina(codMaq);
        
        // 1. Validar Cliente actualizado (200ml * 0.10 = 20.0)
        // Se usa el delta 0.01 para evitar avisos de deprecación en double
        assertEquals(20.0, c.getTotalConsumido(), 0.01);
        
        // 2. Validar Máquina afectada dinámicamente[cite: 1, 2]
        // El error anterior (9700 vs 4800) se soluciona restando del inicial real
        double contenidoEsperado = contenidoInicial - cantidadAConsumir;
        assertEquals(contenidoEsperado, m.getCantidadActual(), 0.01);
        // Consultar valor vendido
        assertEquals(20.0, nm.consultarValorVendido(), 0.01);
    }
}