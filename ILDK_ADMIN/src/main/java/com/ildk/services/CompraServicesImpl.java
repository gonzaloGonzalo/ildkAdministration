package com.ildk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ildk.dao.impl.CompraDao;
import com.ildk.model.Compra;

public class CompraServicesImpl implements CompraServices {

	@Autowired
	CompraDao compraDao;
	
	public void guardarCompra(Compra compra) throws Exception {
		 compraDao.guardarCompra(compra);
	}

	public Compra compraPorId(int id) throws Exception {
		return compraDao.compraPorId(id);
	}

	public List<Compra> listarCompra() throws Exception {
		return compraDao.listarCompras();
	}

	public void eliminarCompra(int id) throws Exception {
		 compraDao.eliminarCompra(id);
	}

}
