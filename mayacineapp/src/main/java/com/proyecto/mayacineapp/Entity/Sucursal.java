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
@Table(name = "sucursal")
public class Sucursal implements Serializable{

	private static final long serialVersionUID = -4841012421662994272L;
	
	@Id
	@Column(name="id_Sucursal")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Sucursal;
	
	@Column(name = "Direccion")
	private String Direccion;
	
	@Column(name = "Correo_Electronico")
	private String Correo_Electronico;
	
	@Column(name = "Numero_Telefonico")
	private int Numero_Telefonico;
	
	@Column(name = "id_cine")
	private int id_cine;

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}

	public int getNumero_Telefonico() {
		return Numero_Telefonico;
	}

	public void setNumero_Telefonico(int numero_Telefonico) {
		Numero_Telefonico = numero_Telefonico;
	}

	public int getId_cine() {
		return id_cine;
	}

	public void setId_cine(int id_cine) {
		this.id_cine = id_cine;
	}
	
	
}
