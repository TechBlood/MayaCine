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

import com.proyecto.mayacineapp.Entity.Sala;
import com.proyecto.mayacineapp.Repository.SalaRepository;

@RestController
@RequestMapping("/sala")
@CrossOrigin
public class SalaService {

	@Autowired
	SalaRepository salaRepository;
	
	@GetMapping(path="/buscar")
	public List<Sala> buscar(){
		return salaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Sala guardar(@RequestBody Sala sala) {
		return salaRepository.save(sala);
	}
	
	@DeleteMapping(path="/eliminar/{id_Sala}")
	public void eliminar(@PathVariable("id_Sala") int id_Sala) {
		Optional<Sala> sala = salaRepository.findById(id_Sala);
		
		if(sala.isPresent()) {
			salaRepository.delete(sala.get());
		}
	}
	
}
