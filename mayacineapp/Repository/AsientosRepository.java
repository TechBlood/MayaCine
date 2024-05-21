package com.proyecto.mayacineapp.Repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.mayacineapp.Entity.Asientos;

@Repository("asientosRepository")
public interface AsientosRepository extends JpaRepository<Asientos, Serializable>{


}
