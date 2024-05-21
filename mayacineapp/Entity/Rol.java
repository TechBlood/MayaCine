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
@Table(name = "rol")
public class Rol implements Serializable{

	private static final long serialVersionUID = -5442902004864564806L;
	
	@Id
	@Column(name="id_Rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Rol;
	
	@Column(name = "Tipo_Rol")
	private String Tipo_Rol;

	public int getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}

	public String getTipo_Rol() {
		return Tipo_Rol;
	}

	public void setTipo_Rol(String tipo_Rol) {
		Tipo_Rol = tipo_Rol;
	}
	
	
	
}
