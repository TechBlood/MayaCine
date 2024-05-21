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


import com.proyecto.mayacineapp.Entity.Cine;
import com.proyecto.mayacineapp.Repository.CineRepository;


@RestController
@RequestMapping("/cine")
@CrossOrigin
public class CineService {

	@Autowired
	CineRepository cineRepository;
	
	@GetMapping(path="/buscar")
	public List<Cine> buscar(){
		return cineRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Cine guardar(@RequestBody Cine cine) {
		return cineRepository.save(cine);
	}
	
	@DeleteMapping(path="/eliminar/{id_Cine}")
	public void eliminar(@PathVariable("id_Cine") int id_Cine) {
		Optional<Cine> cine = cineRepository.findById(id_Cine);
		
		if(cine.isPresent()) {
			cineRepository.delete(cine.get());
		}
	}
}
