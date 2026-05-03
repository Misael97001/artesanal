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
}