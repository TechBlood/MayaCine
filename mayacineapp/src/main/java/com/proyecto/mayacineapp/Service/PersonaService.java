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

import com.proyecto.mayacineapp.Entity.Persona;
import com.proyecto.mayacineapp.Repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping(path="/buscar")
	public List<Persona> buscar(){
		return personaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Persona guardar(@RequestBody Persona persona) {
		return personaRepository.save(persona);
	}
	
	@DeleteMapping(path="/eliminar/{id_Persona}")
	public void eliminar(@PathVariable("id_Persona") int id_Persona) {
		Optional<Persona> persona = personaRepository.findById(id_Persona);
		
		if(persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
	}
	
}
