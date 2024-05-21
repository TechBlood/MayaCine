package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Funcion;

@Repository("funcionRepository")
public interface FuncionRepository extends JpaRepository<Funcion, Serializable>{

}
