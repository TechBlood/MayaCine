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
@Table(name = "tipo_asiento")
public class Tipo_Asiento implements Serializable{


	private static final long serialVersionUID = 213203840683810304L;
	
	@Id
	@Column(name="id_Tipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Tipo;
	
	@Column(name = "Tipo_Asiento")
	private String Tipo_Asiento;

	public int getId_Tipo() {
		return id_Tipo;
	}

	public void setId_Tipo(int id_Tipo) {
		this.id_Tipo = id_Tipo;
	}

	public String getTipo_Asiento() {
		return Tipo_Asiento;
	}

	public void setTipo_Asiento(String tipo_Asiento) {
		Tipo_Asiento = tipo_Asiento;
	}
	
	
	
}
