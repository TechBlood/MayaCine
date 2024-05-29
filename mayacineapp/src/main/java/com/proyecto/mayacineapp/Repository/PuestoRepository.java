package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Puesto;

@Repository("puestoRepository")
public interface PuestoRepository extends JpaRepository<Puesto, Serializable>{

}
