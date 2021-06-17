package com.reservaturnos.sistema.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservaturnos.sistema.dto.ComerciosDTO;
import com.reservaturnos.sistema.dto.ResponseDTO;

import com.reservaturnos.sistema.service.IComerciosService;


@RestController
@RequestMapping(path = "/api-comercios/v1")
public class ComerciosController {

	@Autowired
	private IComerciosService comerciosService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll() {
		
		return comerciosService.getAll();		
	}
	
	
	//Listar uno
	
	@GetMapping(path = "/comercios/{id_comercio}")
	public ResponseDTO getComerciosById(@PathVariable Integer id_comercio) {
		
		return comerciosService.getComerciosById(id_comercio);
	}
	
	
	//Crear
	
	@PostMapping(path = "/crear" , consumes = "application/json", produces = "application/json")
	public ResponseDTO createComercios(@RequestBody ComerciosDTO comerciosDTO) {
		
		return comerciosService.createComercios(comerciosDTO);
	}
	
	
	//Editar
	
	@PostMapping(path = "/editar" , consumes = "application/json", produces = "application/json")
	public ResponseDTO updateComercios(@RequestBody ComerciosDTO entity) {
		
		return comerciosService.updateComercios(entity);
	}
	
	//eliminar
	
	@GetMapping(path = "/borrar/{id_comercio}")
	public void eliminarComercios(@PathVariable Integer id_comercio) {
		
		comerciosService.deleteComercios(id_comercio);
	}
}
