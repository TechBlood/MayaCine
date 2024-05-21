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

import com.proyecto.mayacineapp.Entity.Funcion;
import com.proyecto.mayacineapp.Repository.FuncionRepository;

@RestController
@RequestMapping("/funcion")
@CrossOrigin
public class FuncionService {

	@Autowired
	FuncionRepository funcionRepository;
	
	@GetMapping(path="/buscar")
	public List<Funcion> buscar(){
		return funcionRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Funcion guardar(@RequestBody Funcion funcion) {
		return funcionRepository.save(funcion);
	}
	
	@DeleteMapping(path="/eliminar/{id_Funcion}")
	public void eliminar(@PathVariable("id_Funcion") int id_Funcion) {
		Optional<Funcion> funcion = funcionRepository.findById(id_Funcion);
		
		if(funcion.isPresent()) {
			funcionRepository.delete(funcion.get());
		}
	}
	
}
