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

import com.Andres.projectofinal.entity.Partido;
import com.Andres.projectofinal.repository.PartidoRepository;

@RestController
@RequestMapping("/partido")
@CrossOrigin
public class PartidoService {

	
	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping(path="/buscar")
	public List<Partido> buscar(){
		return partidoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Partido guardar(@RequestBody Partido partido) {
		return partidoRepository.save(partido);
	}
	
	@DeleteMapping(path="/eliminar/{idpartido}")
	public void eliminar(@PathVariable("idpartido") int idpartido) {
		Optional<Partido> partido = partidoRepository.findById(idpartido);
		
		if(partido.isPresent()) {
			partidoRepository.delete(partido.get());
		}
	}
}
