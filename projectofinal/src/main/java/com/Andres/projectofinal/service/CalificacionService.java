package com.Andres.projectofinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Andres.projectofinal.entity.Calificacion;
import com.Andres.projectofinal.repository.CalificacionRepository;


@RestController
@RequestMapping("/calificacion")
@CrossOrigin
@Service
public class CalificacionService {
	
	@Autowired
	CalificacionRepository calificacionRepository;
	
	@GetMapping(path="/buscar")
	public List<Calificacion> buscar(){
		return calificacionRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Calificacion guardar(@RequestBody Calificacion calificacion) {
		return calificacionRepository.save(calificacion);
	}
	
	@DeleteMapping(path="/eliminar/{idcalificacion}")
	public void eliminar(@PathVariable("idcalificacion") int idcalificacion) {
		Optional<Calificacion> calificacion = calificacionRepository.findById(idcalificacion);
		
		if(calificacion.isPresent()) {
			calificacionRepository.delete(calificacion.get());
		}
	}
}

