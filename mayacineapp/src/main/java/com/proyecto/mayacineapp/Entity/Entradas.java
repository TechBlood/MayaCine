package com.proyecto.mayacineapp.Entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entradas")
public class Entradas implements Serializable{

	private static final long serialVersionUID = 773019919496513230L;

	@Id
	@Column(name="identradas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idEntradas;
	
	@Column(name = "Cantidad")
	private int Cantidad;
	
	@Column(name = "id_Funcion")
	private int id_Funcion;
	
	@Column(name = "id_Persona")
	private int id_Persona;

	public int getIdEntradas() {
		return idEntradas;
	}

	public void setIdEntradas(int idEntradas) {
		this.idEntradas = idEntradas;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getId_Funcion() {
		return id_Funcion;
	}

	public void setId_Funcion(int id_Funcion) {
		this.id_Funcion = id_Funcion;
	}

	public int getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}

	
	
	
}
