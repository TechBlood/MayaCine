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

import com.proyecto.mayacineapp.Entity.Asientos;
import com.proyecto.mayacineapp.Repository.AsientosRepository;

@RestController
@RequestMapping("/asientos")
@CrossOrigin
public class AsientosService {
     //RUTA PARA LAS CONSULTAS/"Metodos"
	//http://localhost:9191/{"tabla"}/{"orden"}
	
	@Autowired
	AsientosRepository asientosRepository;
	
	@GetMapping(path="/buscar")
	public List<Asientos> buscar(){
		return asientosRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Asientos guardar(@RequestBody Asientos asientos) {
		return asientosRepository.save(asientos);
	}
	
	@DeleteMapping(path="/eliminar/{idAsientos}")
	public void eliminar(@PathVariable("idAsientos") int idAsientos) {
		Optional<Asientos> asientos = asientosRepository.findById(idAsientos);
		
		if(asientos.isPresent()) {
			asientosRepository.delete(asientos.get());
		}
	}
	
	
	}

