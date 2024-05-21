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
@Table(name = "cine")
public class Cine implements Serializable{

	private static final long serialVersionUID = -7568222184656249480L;

	@Id
	@Column(name="id_Cine")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Cine;

	public int getId_Cine() {
		return id_Cine;
	}

	public void setId_Cine(int id_Cine) {
		this.id_Cine = id_Cine;
	}

	
}
