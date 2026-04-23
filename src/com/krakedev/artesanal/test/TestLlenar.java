package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		Maquina rubia= new Maquina("Pilsener", "cerveza fria", 0.02, 8000, "ABC" );
		rubia.imprimir();
		rubia.llenarMaquina();
		rubia.imprimir();
		
		Maquina negra = new Maquina("Club", "cerveza buena", 0.03,"ABC");
		negra.imprimir();
		negra.llenarMaquina();
		negra.imprimir();
		
	}
}
