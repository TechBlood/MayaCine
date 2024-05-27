package com.Andres.projectofinal.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "viaje")
public class Viaje implements Serializable {

	private static final long serialVersionUID = -512543816898250931L;

	@Id
	@Column(name="idviaje")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idviaje;
	
	@Column(name="fecha_partida")
	private Date fechaPartida;
	
	@Column(name="fecha_regreso")
	private Date fechaRegreso;
	
	@Column(name="cupo")
	private int cupo;
	
	@Column(name="descripcion")
	private String descripcion;

	@Column(name="origen")
	private int origen;
	
	@Column(name="destino")
	private int destino;

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	public Date getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public Date getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(Date fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}
	
}
