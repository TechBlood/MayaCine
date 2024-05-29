package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Estado_Asiento;

@Repository("estado_AsientoRepository")
public interface Estado_AsientoRepository extends JpaRepository<Estado_Asiento, Serializable>{

}
