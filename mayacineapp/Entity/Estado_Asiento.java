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
@Table(name = "estadoAsiento")
public class Estado_Asiento implements Serializable{

	private static final long serialVersionUID = 5757080174114795675L;

	@Id
	@Column(name="id_Estado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Estado;
	
	@Column(name = "Tipo_Estado")
	private String Tipo_Estado;

	public int getId_Estado() {
		return id_Estado;
	}

	public void setId_Estado(int id_Estado) {
		this.id_Estado = id_Estado;
	}

	public String getTipo_Estado() {
		return Tipo_Estado;
	}

	public void setTipo_Estado(String tipo_Estado) {
		Tipo_Estado = tipo_Estado;
	}
	
	

}
