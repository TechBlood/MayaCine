package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Entradas;

@Repository("entradasRepository")
public interface EntradasRepository extends JpaRepository<Entradas, Serializable>{

}
