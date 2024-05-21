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
@Table(name = "pelicula")
public class Pelicula implements Serializable{

	
	private static final long serialVersionUID = -9039977620423537653L;

	@Id
	@Column(name="id_Pelicula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_Pelicula;
	
	@Column(name = "Titulo")
	private String Titulo; 
	
	@Column(name = "Clacificación")
	private String Clacificación;
	
	@Column(name = "Sinopsis")
	private String Sinopsis;
	
	@Column(name = "Duración")
	private String Duración;
	
	@Column(name = "Fecha_Estreno")
	private String Fecha_Estreno;
	
	@Column(name = "Reparto")
	private String Reparto;
	
	@Column(name = "Poster")
	private String Poster;
	
	@Column(name = "id_Categoria")
	private String id_Categoria;

	public int getId_Pelicula() {
		return id_Pelicula;
	}

	public void setId_Pelicula(int id_Pelicula) {
		this.id_Pelicula = id_Pelicula;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getClacificación() {
		return Clacificación;
	}

	public void setClacificación(String clacificación) {
		Clacificación = clacificación;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public String getDuración() {
		return Duración;
	}

	public void setDuración(String duración) {
		Duración = duración;
	}

	public String getFecha_Estreno() {
		return Fecha_Estreno;
	}

	public void setFecha_Estreno(String fecha_Estreno) {
		Fecha_Estreno = fecha_Estreno;
	}

	public String getReparto() {
		return Reparto;
	}

	public void setReparto(String reparto) {
		Reparto = reparto;
	}

	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}

	public String getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(String id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	
	
}
