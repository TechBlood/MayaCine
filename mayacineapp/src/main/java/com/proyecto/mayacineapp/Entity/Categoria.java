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
@Table(name = "categoria")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 7718747302174085297L;

	
	@Id
	@Column(name="id_Categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Categoria;
	
	@Column(name = "Genero")
	private String Genero;

	public int getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}
	
	
}
