package com.proyecto.mayacineapp.Entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "asientos")
public class Asientos implements Serializable{

//serialVersionUID es un identificador para cada clase/tabla
	private static final long serialVersionUID = -7169022296432900358L;

	
	@Id
	@Column(name="idasientos")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idAsientos;
	
	@Column(name = "numeroAsiento")
	private int Numero_Asiento;
	
	@Column(name = "Fila")
	private String Fila;
	
	@Column(name = "idEstado")
	private int id_Estado;
	
	@Column(name = "idTipo")
	private int id_Tipo;
	
	@Column(name = "idSala")
	private int id_Sala;

	public int getIdAsientos() {
		return idAsientos;
	}

	public void setIdAsientos(int idAsientos) {
		this.idAsientos = idAsientos;
	}

	public int getNumero_Asiento() {
		return Numero_Asiento;
	}

	public void setNumero_Asiento(int numero_Asiento) {
		Numero_Asiento = numero_Asiento;
	}

	public String getFila() {
		return Fila;
	}

	public void setFila(String fila) {
		Fila = fila;
	}

	public int getId_Estado() {
		return id_Estado;
	}

	public void setId_Estado(int id_Estado) {
		this.id_Estado = id_Estado;
	}

	public int getId_Tipo() {
		return id_Tipo;
	}

	public void setId_Tipo(int id_Tipo) {
		this.id_Tipo = id_Tipo;
	}

	public int getId_Sala() {
		return id_Sala;
	}

	public void setId_Sala(int id_Sala) {
		this.id_Sala = id_Sala;
	}

	
}
