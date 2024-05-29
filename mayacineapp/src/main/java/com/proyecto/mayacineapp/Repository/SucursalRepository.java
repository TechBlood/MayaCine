package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Sucursal;

@Repository("sucursalRepository")
public interface SucursalRepository extends JpaRepository<Sucursal, Serializable>{

}
