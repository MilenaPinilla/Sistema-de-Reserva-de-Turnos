package com.reservaturnos.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservaturnos.sistema.entity.ServiciosEntity;
import com.reservaturnos.sistema.service.IServiciosService;




@RestController
@RequestMapping(path = "/api-servicios/v1")

public class ServiciosController {
	
	
	@Autowired
	private IServiciosService serviciosService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public List<ServiciosEntity> getAll() {
		
		return serviciosService.getAll();		
	}
	
	//Listar uno
	
	@GetMapping(path = "/servicios/{id_servicio}")
	public ServiciosEntity getServiciosById(@PathVariable Integer id_servicio) {
		
		return serviciosService.getServiciosById(id_servicio);
	}
	//Crear
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json" )
	public ServiciosEntity createServicios(@RequestBody ServiciosEntity entity) {
		
		return serviciosService.createServicios(entity);
	}
	
	//Editar
	
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json" )
	public ServiciosEntity updateServicios(@RequestBody ServiciosEntity entity) {
		
		return serviciosService.updateServicios(entity);
	}
	
	//eliminar
	
	@GetMapping(path = "/borrar/{id_servicio}")
	public void eliminarServicios(@PathVariable Integer id_servicio) {
				
		serviciosService.deleteServicios(id_servicio);
	}
}
