package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
    private ArrayList<Maquina> maquinas;

    public NegocioMejorado() {
        this.maquinas = new ArrayList<>();
    }
    
    // Getters y Setters

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
    
	public String generarCodigo() {
	    int randomNum = (int) (Math.random() * 100) + 1;
	    return "M-" + randomNum;
	}
	
	
	public void agregarMaquina(String nombre, String descripcion, double precio) {
	    String codigo = generarCodigo();
	    Maquina nueva = new Maquina(nombre, descripcion, precio, codigo);
	    maquinas.add(nueva);
	}
	
	public void cargarMaquinas() {
	    for (Maquina m : maquinas) {
	        m.llenarMaquina(); 
	    }
	}
	
	public Maquina recuperarMaquina(String codigo) {
	    for (Maquina m : maquinas) {
	        if (m.getCodigo().equals(codigo)) {
	            return m;
	        }
	    }
	    return null;
	}

}