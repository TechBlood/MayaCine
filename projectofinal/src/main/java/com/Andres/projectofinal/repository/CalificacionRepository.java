package com.Andres.projectofinal.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Andres.projectofinal.entity.Calificacion;

@Repository("CalificacionRepository")
public interface CalificacionRepository extends JpaRepository<Calificacion, Serializable>{

}
