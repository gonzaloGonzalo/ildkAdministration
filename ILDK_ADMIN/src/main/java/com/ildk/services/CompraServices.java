package com.ildk.services;

import java.util.List;

import com.ildk.model.Compra;

public interface CompraServices {
	
	public void guardarCompra(Compra compra) throws Exception;
	
	public Compra compraPorId(int id) throws Exception;
	
	public List<Compra> listarCompra() throws Exception;
	
	public void eliminarCompra(int id) throws Exception;
}
