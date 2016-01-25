/********************************************************
 * FileName - Compra.java
 *
 *
 * $Author: garag $
 * $Revision:  $
 * $Change:  $
 * $Date: $
 ********************************************************/

package com.ildk.back.model;

import java.util.Date;


/**
 * Created by garag on 02/25/15.
 */

public class Compra extends BaseObject{

	private static final long serialVersionUID = 1L;
	private int id;
	private int nroDeTicket;
	private String categoria;
	private Date fecha;
	private String descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNroDeTicket() {
		return nroDeTicket;
	}
	public void setNroDeTicket(int nroDeTicket) {
		this.nroDeTicket = nroDeTicket;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
