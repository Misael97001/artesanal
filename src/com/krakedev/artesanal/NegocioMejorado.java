package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
    private ArrayList<Maquina> maquinas;
    
    
    private ArrayList<Cliente> clientes= new ArrayList<Cliente>();
    private int ultimoCodigo=100;
    
    
    
    public void registrarCliente(String nombre, String cedula) {
    	Cliente c=new Cliente(nombre, cedula);
    	c.setCodigo(ultimoCodigo);
    	ultimoCodigo++;
    	clientes.add(c); 
        
    }
    
    public NegocioMejorado() {
        this.maquinas = new ArrayList<>();
    }
    
    // Getters y Setters

    
	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
    
	public String generarCodigo() {
	    int randomNum = (int) (Math.random() * 100) + 1;
	    return "M-" + randomNum;
	}
	
	
	public boolean agregarMaquina(String nombre, String descripcion, double precio) {
	    String codigo = generarCodigo();
	    if (recuperarMaquina(codigo) == null) {
	        maquinas.add(new Maquina(nombre, descripcion, precio,codigo));
	        return true;
	    }
	    return false;
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
	
	public Cliente buscarClientePorCedula(String cedula) {
	    for (Cliente c : clientes) {
	        if (c.getCedula().equals(cedula)) {
	        	return c;
	        }
	    }
	    return null;
	}

	public Cliente buscarClientePorCodigo(int codigo) {
	    for (Cliente c : clientes) {
	        if (c.getCodigo()==codigo) {
	        	return c;
	        }
	    }
	    return null;
	}
	
	public void consumirCerveza(int codCli, String codMaq, int cant) {
	    Maquina m = recuperarMaquina(codMaq);
	    Cliente c = buscarClientePorCodigo(codCli);
	    if (m != null && c != null) {
	        double valor = m.servirCerveza(cant); 
	        registrarConsumo(c, valor);
	    }
	}

	private void registrarConsumo(Cliente c, double valor) {
	    c.setTotalConsumido(c.getTotalConsumido() + valor);
	}
	
	public double consultarValorVendido() {
	    double total = 0;
	    for (Cliente c : clientes) {
	        total += c.getTotalConsumido();
	    }
	    return total;
	}	

}