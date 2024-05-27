package com.Andres.projectofinal.service;

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


import com.Andres.projectofinal.entity.Usuario;
import com.Andres.projectofinal.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscar(){
		return usuarioRepository.findAll(); 
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario usuario) {
		List<Usuario> user = usuarioRepository.findByCorreoAndPassword(usuario.getCorreo(),usuario.getPassword());
		
		if(user!=null && !user.isEmpty()) {
			return user.get(0);
		}
		return null;
		
	}
	
	@DeleteMapping(path="/eliminar/{idusuario}")
	public void eliminar(@PathVariable("idusuario") int idusuario) {
		Optional<Usuario> usuario = usuarioRepository.findById(idusuario);
		
		if(usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		}
	}
}
