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

import com.proyecto.mayacineapp.Entity.Sucursal;
import com.proyecto.mayacineapp.Repository.SucursalRepository;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin
public class SucursalService {

	@Autowired
	SucursalRepository sucursalRepository;
	
	@GetMapping(path="/buscar")
	public List<Sucursal> buscar(){
		return sucursalRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Sucursal guardar(@RequestBody Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}
	
	@DeleteMapping(path="/eliminar/{id_Sucursal}")
	public void eliminar(@PathVariable("id_Sucursal") int id_Sucursal) {
		Optional<Sucursal> sucursal = sucursalRepository.findById(id_Sucursal);
		
		if(sucursal.isPresent()) {
			sucursalRepository.delete(sucursal.get());
		}
	}
	
}
