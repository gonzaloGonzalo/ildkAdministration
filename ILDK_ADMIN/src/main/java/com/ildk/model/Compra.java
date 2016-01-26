package com.ildk.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="compras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcompras;
	
	@Size(min=3, max=50)
	@Column(name = "nroDeTicket", nullable = false)
	private String nroDeTicket;

	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "fecha", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate fecha;
	
	@Size(min=3, max=50)
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Size(min=3, max=50)
	@Column(name = "categoria", nullable = false)
	private String categoria;

	public int getIdcompras() {
		return idcompras;
	}

	public void setIdcompras(int idcompras) {
		this.idcompras = idcompras;
	}

	public String getNroDeTicket() {
		return nroDeTicket;
	}

	public void setNroDeTicket(String nroDeTicket) {
		this.nroDeTicket = nroDeTicket;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
