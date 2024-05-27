package com.Andres.projectofinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Andres.projectofinal.entity.Administrador;
import com.Andres.projectofinal.repository.AdministradorRepository;


@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdministradorService {

	@Autowired
	AdministradorRepository administradorRepository;
	
	@GetMapping(path="/buscar")
	public List<Administrador> buscar(){
		return administradorRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Administrador guardar(@RequestBody Administrador administrador) {
		return administradorRepository.save(administrador);
	}
	//Guiate de esto (Esto es el dichoso servicio, es la base vaya, es el que hace el puente)
	@PostMapping(path="/login")
	public Administrador login(@RequestBody Administrador administrador) {
		List<Administrador> admin = administradorRepository.findByNombreAndPassword(administrador.getNombre(),administrador.getPassword());
		
		if(admin!=null && !admin.isEmpty()) {
			return admin.get(0);
		}
		return null;
		//
	}
	@DeleteMapping(path="/eliminar/{idadministrador}")
	public void eliminar(@PathVariable("idadministrador") int idadministrador) {
		Optional<Administrador> administrador = administradorRepository.findById(idadministrador);
		
		if(administrador.isPresent()) {
			administradorRepository.delete(administrador.get());
		}
	}
	
	
	}

