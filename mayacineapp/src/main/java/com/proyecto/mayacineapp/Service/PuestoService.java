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

import com.proyecto.mayacineapp.Entity.Puesto;
import com.proyecto.mayacineapp.Repository.PuestoRepository;

@RestController
@RequestMapping("/puesto")
@CrossOrigin
public class PuestoService {

	@Autowired
	PuestoRepository puestoRepository;
	
	@GetMapping(path="/buscar")
	public List<Puesto> buscar(){
		return puestoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Puesto guardar(@RequestBody Puesto puesto) {
		return puestoRepository.save(puesto);
	}
	
	@DeleteMapping(path="/eliminar/{id_Puesto}")
	public void eliminar(@PathVariable("id_Puesto") int id_Puesto) {
		Optional<Puesto> puesto = puestoRepository.findById(id_Puesto);
		
		if(puesto.isPresent()) {
			puestoRepository.delete(puesto.get());
		}
	}
	
}
