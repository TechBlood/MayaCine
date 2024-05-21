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

import com.proyecto.mayacineapp.Entity.Categoria;
import com.proyecto.mayacineapp.Repository.CategoriaRepository;


@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping(path="/buscar")
	public List<Categoria> buscar(){
		return categoriaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Categoria guardar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@DeleteMapping(path="/eliminar/{id_Categoria}")
	public void eliminar(@PathVariable("id_Categoria") int id_Categoria) {
		Optional<Categoria> categoria = categoriaRepository.findById(id_Categoria);
		
		if(categoria.isPresent()) {
			categoriaRepository.delete(categoria.get());
		}
	}
	
}
