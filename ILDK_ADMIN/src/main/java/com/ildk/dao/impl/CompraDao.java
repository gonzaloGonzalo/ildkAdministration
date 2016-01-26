package com.ildk.dao.impl;

import java.util.List;

import com.ildk.model.Compra;

public interface CompraDao {

	Compra compraPorId(int id) throws Exception;

	void guardarCompra(Compra compra) throws Exception;
	
	void eliminarCompra(int ssn) throws Exception;
	
	List<Compra> listarCompras() throws Exception;

	Compra comprasPorSsn(int ssn) throws Exception;
}
