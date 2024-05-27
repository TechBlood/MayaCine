package com.Andres.projectofinal.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partido")
public class Partido implements Serializable{

	private static final long serialVersionUID = -460024782307324266L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idpartido")
	private Integer idpartido;
	
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	
	@Column(name = "fecha_fin")
	private Date fechaFin;
	
	@Column(name = "gol1")
	private Integer gol1;
	
	@Column(name = "gol2")
	private Integer gol2;
	
	@Column(name = "pais_idpais")
	private Integer paisIdpais;
	
	@Column(name = "pais_idpais1")
	private Integer paisIdpais1;

	public Integer getIdpartido() {
		return idpartido;
	}

	public void setIdpartido(Integer idpartido) {
		this.idpartido = idpartido;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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

	public Integer getPaisIdpais() {
		return paisIdpais;
	}

	public void setPaisIdpais(Integer paisIdpais) {
		this.paisIdpais = paisIdpais;
	}

	public Integer getPaisIdpais1() {
		return paisIdpais1;
	}

	public void setPaisIdpais1(Integer paisIdpais1) {
		this.paisIdpais1 = paisIdpais1;
	}
	

}
	

