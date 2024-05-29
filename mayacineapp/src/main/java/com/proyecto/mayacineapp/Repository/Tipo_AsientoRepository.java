package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Tipo_Asiento;

@Repository("tipo_AsientoRepository")
public interface Tipo_AsientoRepository extends JpaRepository<Tipo_Asiento, Serializable> {

}
