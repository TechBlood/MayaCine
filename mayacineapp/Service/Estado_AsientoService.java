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

import com.proyecto.mayacineapp.Entity.Estado_Asiento;
import com.proyecto.mayacineapp.Repository.Estado_AsientoRepository;

@RestController
@RequestMapping("/estadoAsiento")
@CrossOrigin
public class Estado_AsientoService {

	@Autowired
	Estado_AsientoRepository estado_AsientoRepository;
	
	@GetMapping(path="/buscar")
	public List<Estado_Asiento> buscar(){
		return estado_AsientoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Estado_Asiento guardar(@RequestBody Estado_Asiento estado_Asiento) {
		return estado_AsientoRepository.save(estado_Asiento);
	}
	
	@DeleteMapping(path="/eliminar/{id_Estado}")
	public void eliminar(@PathVariable("id_Estado") int id_Estado) {
		Optional<Estado_Asiento> estado_Asiento = estado_AsientoRepository.findById(id_Estado);
		
		if(estado_Asiento.isPresent()) {
			estado_AsientoRepository.delete(estado_Asiento.get());
		}
	}
}
