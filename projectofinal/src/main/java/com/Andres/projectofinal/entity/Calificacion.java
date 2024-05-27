package com.Andres.projectofinal.entity;

import java.io.Serializable;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calificacion")
public class Calificacion implements Serializable{

	
	
	
	private static final long serialVersionUID = 2141634356361047311L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcalificacion")
	private Integer idcalificacion;
	
	@Column(name = "nota")
	private Integer nota;
	
	@Column(name = "nombre")
	private String nombre;

	public Integer getIdcalificacion() {
		return idcalificacion;
	}

	public void setIdcalificacion(Integer idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}