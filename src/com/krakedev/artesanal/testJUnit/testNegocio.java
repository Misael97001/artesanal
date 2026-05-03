package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class testNegocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Negocio negocio1= new Negocio() ;
		System.out.println("Nombre: " + negocio1.getNombre());
		System.out.println("Maquina: " + negocio1.getMaquinaA());
	
		
		Maquina m1= negocio1.getMaquinaA();
		double capacidad= m1.getCapacidadMaxima();
	}

}
