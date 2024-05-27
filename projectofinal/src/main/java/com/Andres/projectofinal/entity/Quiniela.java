package com.Andres.projectofinal.entity;

import java.io.Serializable;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quiniela")
public class Quiniela implements Serializable{

	private static final long serialVersionUID = 3868931561390988652L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idquiniela")
	private Integer idquiniela;
	
	@Column(name = "gol1")
	private Integer gol1;
	
	@Column(name = "gol2")
	private Integer gol2;
	
	@Column(name = "usuario_idusuario")
	private Integer usuarioIdusuario;
	
	public Integer getUsuarioIdusuario() {
		return usuarioIdusuario;
	}

	public void setUsuarioIdusuario(Integer usuarioIdusuario) {
		this.usuarioIdusuario = usuarioIdusuario;
	}

	@ManyToOne 
	@JoinColumn(name = "quiniela")
	Partido partido;
	

	public Integer getIdquiniela() {
		return idquiniela;
	}

	public void setIdquiniela(Integer idquiniela) {
		this.idquiniela = idquiniela;
	}

	public Integer getGol1() {
		return gol1;
	}

	public void setGol1(Integer gol1) {
		this.gol1 = gol1;
	}

	public Integer getGol2() {
		return gol2;
	}

	public void setGol2(Integer gol2) {
		this.gol2 = gol2;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}


	
	
}
