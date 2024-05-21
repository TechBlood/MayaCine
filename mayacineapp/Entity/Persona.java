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
@Table(name = "persona")
public class Persona implements Serializable{

	private static final long serialVersionUID = -7352545810506752517L;

	@Id
	@Column(name="id_Persona")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String id_Persona;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "idPuesto")
	private int id_Puesto;
	
	@Column(name = "idRol")
	private int id_Rol;

	public String getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(String id_Persona) {
		this.id_Persona = id_Persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getId_Puesto() {
		return id_Puesto;
	}

	public void setId_Puesto(int id_Puesto) {
		this.id_Puesto = id_Puesto;
	}

	public int getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}

	
	
	
}
