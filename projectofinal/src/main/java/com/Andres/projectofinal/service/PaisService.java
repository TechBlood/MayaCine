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

import com.Andres.projectofinal.entity.Pais;
import com.Andres.projectofinal.repository.PaisRepository;

@RestController
@RequestMapping("/pais")
@CrossOrigin
public class PaisService {

	@Autowired
	PaisRepository paisRepository;
	
	@GetMapping(path="/buscar")
	public List<Pais> buscar(){
		return paisRepository.findAll();
	}
	
	@GetMapping(path="/selecbuscar")
	public List<Pais> selecbuscar(){
		return paisRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Pais guardar(@RequestBody Pais pais) {
		return paisRepository.save(pais);
	}
	
	@DeleteMapping(path="/eliminar/{idpais}")
	public void eliminar(@PathVariable("idpais") int idpais) {
		Optional<Pais> pais = paisRepository.findById(idpais);
		
		if(pais.isPresent()) {
			paisRepository.delete(pais.get());
		}
	}
}


