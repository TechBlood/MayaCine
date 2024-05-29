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
@Table(name = "sala")
public class Sala implements Serializable{

	private static final long serialVersionUID = 7092231344532172513L;
	
	@Id
	@Column(name="id_Sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Sala;
	
	@Column(name = "Capacidad_Asientos")
	private int Capacidad_Asientos;
	
	@Column(name = "Nombre_Sala")
	private String Nombre_Sala;
	
	@Column(name = "Id_Sucursal")
	private int Id_Sucursal;

	public int getId_Sala() {
		return id_Sala;
	}

	public void setId_Sala(int id_Sala) {
		this.id_Sala = id_Sala;
	}

	public int getCapacidad_Asientos() {
		return Capacidad_Asientos;
	}

	public void setCapacidad_Asientos(int capacidad_Asientos) {
		Capacidad_Asientos = capacidad_Asientos;
	}

	public String getNombre_Sala() {
		return Nombre_Sala;
	}

	public void setNombre_Sala(String nombre_Sala) {
		Nombre_Sala = nombre_Sala;
	}

	public int getId_Sucursal() {
		return Id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		Id_Sucursal = id_Sucursal;
	}

	
}