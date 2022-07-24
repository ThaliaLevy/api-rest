package com.expertostech.apirest.tutorialrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expertostech.apirest.tutorialrestapi.model.UsuarioModel;
import com.expertostech.apirest.tutorialrestapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired		//injeção de classe
	private UsuarioRepository usuarioRepository; 

	//no parametro da função foi passado @PathVariable("codigo") indicando que o parametro String passado
	//se refere ao {codigo} presente no path da anotação acima do método

	@GetMapping(path = "/api/usuario/{codigo}")
	public ResponseEntity consultarUsuario(@PathVariable("codigo") Integer codigo) {
										// @RequestParam(value = "page", defaultValue = "1") int page, 
										// @RequestParam(value = "sort", required = false) int sort,		//ordenar
										// @RequestParam(value = "limit", defaultValue = "10") int limit) {	//limitar resultados
		return usuarioRepository.findById(codigo)
				.map(record -> ResponseEntity.ok().body(record))	//caso a requisição retorne algo, trará o resultado
				.orElse(ResponseEntity.notFound().build());	//caso não haja resposta, retornará not found
	}
	
	@GetMapping(path = "/api/usuario/listar")
	public ResponseEntity<Iterable<UsuarioModel>> listarUsuarios() {		
		Iterable<UsuarioModel> usuariosSalvos = usuarioRepository.findAll();
		return new ResponseEntity<Iterable<UsuarioModel>>(usuariosSalvos, HttpStatus.OK); //
		
	}
	
	@PostMapping(path = "/api/usuario/salvar")
	public UsuarioModel salvarUsuario(@RequestBody UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
	
	//@PutMapping
	
	
//	@DeleteMapping
}
