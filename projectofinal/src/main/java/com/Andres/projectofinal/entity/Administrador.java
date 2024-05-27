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
@Table(name = "administrador")
public class Administrador implements Serializable {

	private static final long serialVersionUID = 7503637957313942691L;

	@Id
	@Column(name="usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String usuario;
	
	@Column(name = "universidad")
	private String universidad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "carnet")
	private String carnet;
	
	@Column(name = "password")
	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
