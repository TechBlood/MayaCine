package com.proyecto.mayacineapp.Service;

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

import com.proyecto.mayacineapp.Entity.Entradas;
import com.proyecto.mayacineapp.Repository.EntradasRepository;

@RestController
@RequestMapping("/entradas")
@CrossOrigin
public class EntradasService {

	@Autowired
	EntradasRepository entradasRepository;
	
	@GetMapping(path="/buscar")
	public List<Entradas> buscar(){
		return entradasRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Entradas guardar(@RequestBody Entradas entradas) {
		return entradasRepository.save(entradas);
	}
	
	@DeleteMapping(path="/eliminar/{idEntradas}")
	public void eliminar(@PathVariable("idEntradas") int idEntradas) {
		Optional<Entradas> entradas = entradasRepository.findById(idEntradas);
		
		if(entradas.isPresent()) {
			entradasRepository.delete(entradas.get());
		}
	}
}
