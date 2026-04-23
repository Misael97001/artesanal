package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {

		Maquina rubia = new  Maquina("Pilsener", "Cerveza", 0.02,10000, "ABC");

		rubia.imprimir();
		rubia.setNombreCerveza("Golden");
		rubia.imprimir();
	}

}
