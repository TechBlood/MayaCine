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

import com.proyecto.mayacineapp.Entity.Pelicula;
import com.proyecto.mayacineapp.Repository.PeliculaRepository;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin
public class PeliculaService {

	@Autowired
	PeliculaRepository peliculaRepository;
	
	@GetMapping(path="/buscar")
	public List<Pelicula> buscar(){
		return peliculaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Pelicula guardar(@RequestBody Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}
	
	@DeleteMapping(path="/eliminar/{id_Pelicula}")
	public void eliminar(@PathVariable("id_Pelicula") int id_Pelicula) {
		Optional<Pelicula> pelicula = peliculaRepository.findById(id_Pelicula);
		
		if(pelicula.isPresent()) {
			peliculaRepository.delete(pelicula.get());
		}
	}
	
}
