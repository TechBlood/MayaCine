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

import com.proyecto.mayacineapp.Entity.Tipo_Asiento;
import com.proyecto.mayacineapp.Repository.Tipo_AsientoRepository;

@RestController
@RequestMapping("/tipoAsientos")
@CrossOrigin
public class Tipo_AsientoService {

	@Autowired
	Tipo_AsientoRepository tipo_AsientoRepository;
	
	@GetMapping(path="/buscar")
	public List<Tipo_Asiento> buscar(){
		return tipo_AsientoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Tipo_Asiento guardar(@RequestBody Tipo_Asiento tipo_Asiento) {
		return tipo_AsientoRepository.save(tipo_Asiento);
	}
	
	@DeleteMapping(path="/eliminar/{id_Tipo}")
	public void eliminar(@PathVariable("id_Tipo") int id_Tipo) {
		Optional<Tipo_Asiento> tipo_Asiento = tipo_AsientoRepository.findById(id_Tipo);
		
		if(tipo_Asiento.isPresent()) {
			tipo_AsientoRepository.delete(tipo_Asiento.get());
		}
	}
	
}
