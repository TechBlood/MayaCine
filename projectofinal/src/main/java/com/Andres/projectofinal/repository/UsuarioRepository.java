package com.Andres.projectofinal.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Andres.projectofinal.entity.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{

	public List<Usuario> 
	findByNombreLike(String nombre);
	
	List<Usuario> findByCorreoAndPassword(String correo, String password);
	
}
