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
@Table(name = "transacciones")
public class Transacciones implements Serializable{

	private static final long serialVersionUID = 4054100551999088627L;

	@Id
	@Column(name="id_Transacciones")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Transacciones;
	
	@Column(name = "Metodo_Pago")
	private String Metodo_Pago;
	
	@Column(name = "id_Entradas")
	private int id_Entradas;

	public int getId_Transacciones() {
		return id_Transacciones;
	}

	public void setId_Transacciones(int id_Transacciones) {
		this.id_Transacciones = id_Transacciones;
	}

	public String getMetodo_Pago() {
		return Metodo_Pago;
	}

	public void setMetodo_Pago(String metodo_Pago) {
		Metodo_Pago = metodo_Pago;
	}

	public int getId_Entradas() {
		return id_Entradas;
	}

	public void setId_Entradas(int id_Entradas) {
		this.id_Entradas = id_Entradas;
	}
	
	
	
}
