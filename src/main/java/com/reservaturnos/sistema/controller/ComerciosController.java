package com.reservaturnos.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservaturnos.sistema.entity.ComerciosEntity;
import com.reservaturnos.sistema.service.IComerciosService;


@RestController
@RequestMapping(path = "/api-comercios/v1")
public class ComerciosController {

	@Autowired
	private IComerciosService comerciosService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public List<ComerciosEntity> getAll() {
		
		return comerciosService.getAll();		
	}
	
	//Listar uno
	
	@GetMapping(path = "/comercios/{id_comercio}")
	public ComerciosEntity getComerciosById(@PathVariable Integer id_comercio) {
		
		return comerciosService.getComerciosById(id_comercio);
	}
	//Crear
	
	@PostMapping(path = "/crear" , consumes = "application/json", produces = "application/json")
	public ComerciosEntity createComercios(@RequestBody ComerciosEntity entity) {
		
		return comerciosService.createComercios(entity);
	}
	
	
	//Editar
	
	@PostMapping(path = "/editar" , consumes = "application/json", produces = "application/json")
	public ComerciosEntity updateComercios(@RequestBody ComerciosEntity entity) {
		
		return comerciosService.updateComercios(entity);
	}
	
	//eliminar
	
	@GetMapping(path = "/borrar/{id_comercio}")
	public void eliminarComercios(@PathVariable Integer id_comercio) {
		
		comerciosService.deleteComercios(id_comercio);
	}
}
