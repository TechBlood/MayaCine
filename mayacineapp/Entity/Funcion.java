package com.proyecto.mayacineapp.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcion")
public class Funcion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4082796053878978506L;

	@Id
	@Column(name="id_Funcion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Funcion;
	
	@Column(name = "Formato")
	private String Formato;
	
	@Column(name = "Doblaje")
	private String Doblaje;
	
	@Column(name = "Precio")
	private int Precio;
	
	@Column(name = "Fecha")
	private Date Fecha;
	
	@Column(name = "id_Pelicula")
	private int id_Pelicula;
	
	@Column(name = "id_asientos")
	private int id_asientos;

	public int getId_Funcion() {
		return id_Funcion;
	}

	public void setId_Funcion(int id_Funcion) {
		this.id_Funcion = id_Funcion;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public String getDoblaje() {
		return Doblaje;
	}

	public void setDoblaje(String doblaje) {
		Doblaje = doblaje;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public int getId_Pelicula() {
		return id_Pelicula;
	}

	public void setId_Pelicula(int id_Pelicula) {
		this.id_Pelicula = id_Pelicula;
	}

	public int getId_asientos() {
		return id_asientos;
	}

	public void setId_asientos(int id_asientos) {
		this.id_asientos = id_asientos;
	}
	
	
	
}
