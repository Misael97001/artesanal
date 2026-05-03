package com.krakedev.artesanal.testNegocio;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {
 
	public static void main(String[] args) {
        NegocioMejorado nm = new NegocioMejorado();
        nm.registrarCliente("Juan", "172233"); // Lanza NullPointerException
    }
}

