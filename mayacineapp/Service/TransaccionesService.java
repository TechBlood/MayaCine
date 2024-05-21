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

import com.proyecto.mayacineapp.Entity.Transacciones;
import com.proyecto.mayacineapp.Repository.TransaccionesRepository;

@RestController
@RequestMapping("/transaccion")
@CrossOrigin
public class TransaccionesService {

	@Autowired
	TransaccionesRepository transaccionesRepository;
	
	@GetMapping(path="/buscar")
	public List<Transacciones> buscar(){
		return transaccionesRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Transacciones guardar(@RequestBody Transacciones transacciones) {
		return transaccionesRepository.save(transacciones);
	}
	
	@DeleteMapping(path="/eliminar/{id_Transacciones}")
	public void eliminar(@PathVariable("id_Transacciones") int id_Transacciones) {
		Optional<Transacciones> transacciones = transaccionesRepository.findById(id_Transacciones);
		
		if(transacciones.isPresent()) {
			transaccionesRepository.delete(transacciones.get());
		}
	}
	
}
