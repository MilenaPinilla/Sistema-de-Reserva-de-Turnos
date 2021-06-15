package com.reservaturnos.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservaturnos.sistema.entity.TurnosEntity;
import com.reservaturnos.sistema.service.TurnosService;



@RestController
@RequestMapping(path = "/api-turnos/v1")
public class TurnosController {
	
	
	@Autowired
	private TurnosService turnosService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public List<TurnosEntity> getAll() {
		
		return turnosService.getAll();		
	}
	
	//Listar por comercio y servicio
	
	@GetMapping(path = "/comercio/{id_comercio}/servicio/{id_servicio}")
	public List<TurnosEntity> getComerciosById(@PathVariable Integer id_servicio, @PathVariable Integer id_comercio) {
		return turnosService.getTurnos(id_comercio, id_servicio);
	}

}
