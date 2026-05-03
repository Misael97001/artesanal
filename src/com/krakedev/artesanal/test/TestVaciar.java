package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestVaciar {

	public static void main(String[] args) {
		
		/*Crear  un método vaciarMaquina, lo que hace es dejar la cantidadActual en 0 
		 * y la cerveza que tenía al momento
		se registra en el atributo cantidadDesperdicio. El método no retorna nada

		Crear una clase TestVaciar con un main, en el main
		Crear un Negocio
		Agrega una Maquina
		Agrega cerveza
		Sirve cerveza

		Crear una Prueba unitaria con JUnit para probar este método, apoyado en la IA. 
		Explicar qué casos cubre el test, ejecutar 
		
	*/	
		
		boolean resultado;
		double valor;
		Maquina rubia= new Maquina("Pilsener", "cerveza fria", 0.02, 8000, "ABC");
		System.out.println("-----ESTADO INICIAL----");
		rubia.imprimir();
		
		System.out.println("-----RECARGA----");
		resultado=rubia.recargarCerveza(3000);
		rubia.imprimir();
		
		System.out.println("----SERVIR 2000 Ml----");
		valor=rubia.servirCerveza(2000);
		System.out.println("Valor a pagar : $"+valor);
		rubia.imprimir();

		System.out.println("----VACIAR----");
		rubia.vaciarMaquina();
		
		rubia.imprimir();
		System.out.println("Desperdicio: "+ rubia.getCantidadDesperdicio());

		
	}

}
