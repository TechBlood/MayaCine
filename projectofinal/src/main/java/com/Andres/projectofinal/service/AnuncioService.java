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

import com.Andres.projectofinal.entity.Anuncio;
import com.Andres.projectofinal.repository.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
@Service
public class AnuncioService {

	@Autowired
	AnuncioRepository anuncioRepository;
	
	@GetMapping(path="/buscar")
	public List<Anuncio> buscar(){
		return anuncioRepository.findAll();
	}
	
	@PostMapping(path="/guardarAnuncio")
	public Anuncio guardarAnuncio(@RequestBody Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	
	@DeleteMapping(path="/eliminar/{idanuncio}")
	public void eliminar(@PathVariable("idanuncio") int idanuncio) {
		Optional<Anuncio> anuncio = anuncioRepository.findById(idanuncio);
		
		if(anuncio.isPresent()) {
			anuncioRepository.delete(anuncio.get());
		}
	}
}