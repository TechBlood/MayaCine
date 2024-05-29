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
@Table(name = "puesto")
public class Puesto implements Serializable{

	private static final long serialVersionUID = -8167120619816914092L;
	
	@Id
	@Column(name="id_Puesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Puesto;
	
	@Column(name = "Tipo_Puesto")
	private String Tipo_Puesto;

	public int getId_Puesto() {
		return id_Puesto;
	}

	public void setId_Puesto(int id_Puesto) {
		this.id_Puesto = id_Puesto;
	}

	public String getTipo_Puesto() {
		return Tipo_Puesto;
	}

	public void setTipo_Puesto(String tipo_Puesto) {
		Tipo_Puesto = tipo_Puesto;
	}
	
	
}
