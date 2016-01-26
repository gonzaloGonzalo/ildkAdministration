package com.ildk.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ildk.model.Compra;
import com.ildk.model.Status;

@RequestMapping("/compras")
public interface RestController {

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addCompra(@RequestBody Compra compra);
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getCompra(@PathVariable("id") Integer id);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Compra> getCompras();
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status deleteEmployee(@PathVariable("id") Integer id);
}
