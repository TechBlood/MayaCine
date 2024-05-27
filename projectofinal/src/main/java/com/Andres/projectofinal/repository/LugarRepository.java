package com.Andres.projectofinal.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Andres.projectofinal.entity.Lugar;



	@Repository("lugarRepository")
	public interface LugarRepository extends JpaRepository<Lugar, Serializable>{

		public List<Lugar> 
		findByIdlugarLike(Integer idlugar);
	}
	

