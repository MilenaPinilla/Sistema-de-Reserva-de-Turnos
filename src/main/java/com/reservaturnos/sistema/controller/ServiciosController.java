package com.reservaturnos.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservaturnos.sistema.dto.ResponseDTO;
import com.reservaturnos.sistema.dto.ServiciosDTO;
import com.reservaturnos.sistema.service.IServiciosService;




@RestController
@RequestMapping(path = "/api-servicios/v1")

public class ServiciosController {
	
	
	@Autowired
	private IServiciosService serviciosService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll() {
		
		return serviciosService.getAll();		
	}
	
	//Listar uno
	
	@GetMapping(path = "/servicios/{id_servicio}")
	public ResponseDTO getServiciosById(@PathVariable Integer id_servicio) {
		
		return serviciosService.getServiciosById(id_servicio);
	}
	//Crear
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json" )
	public ResponseDTO createServicios(@RequestBody ServiciosDTO serviciosDTO) {
		
		return serviciosService.createServicios(serviciosDTO);
	}
	
	//Editar
	
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json" )
	public ResponseDTO updateServicios(@RequestBody ServiciosDTO serviciosDTO) {
		
		return serviciosService.updateServicios(serviciosDTO);
	}
	
	//eliminar
	
	@GetMapping(path = "/borrar/{id_servicio}")
	public void eliminarServicios(@PathVariable Integer id_servicio) {
				
		serviciosService.deleteServicios(id_servicio);
	}
}
