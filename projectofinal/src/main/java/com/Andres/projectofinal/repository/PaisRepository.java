package com.Andres.projectofinal.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Andres.projectofinal.entity.Pais;

@Repository("paisRepository")
public interface PaisRepository extends JpaRepository<Pais, Serializable>{

}
