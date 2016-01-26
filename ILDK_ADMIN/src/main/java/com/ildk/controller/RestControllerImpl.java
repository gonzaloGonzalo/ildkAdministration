package com.ildk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ildk.model.Compra;
import com.ildk.model.Status;
import com.ildk.services.CompraServices;

@Controller
public class RestControllerImpl implements RestController {

	@Autowired
	CompraServices compraServices;

	public Status addCompra(Compra compra) {
		try {
			compraServices.guardarCompra(compra);
			return new Status(1, "Compra added Successfully !");
		} catch (Exception e) {
			return new Status(1, e.getMessage());
		}
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getCompra(@PathVariable("id") Integer id){
		Compra compra = null;
		try {
			compra = compraServices.compraPorId(id);

		} catch (Exception e) {
			return new Status(1, e.getMessage());
		}
		return compra;
	}

	public List<Compra> getCompras() {

		List<Compra> compras = null;
		try {
			compras = compraServices.listarCompra();
		} catch (Exception e) {
		}
		return compras;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status deleteEmployee(@PathVariable("id") Integer id){

		try {
			compraServices.eliminarCompra(id);
			return new Status(1, "Compra deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}
}
