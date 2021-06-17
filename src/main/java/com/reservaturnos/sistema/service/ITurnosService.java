package com.reservaturnos.sistema.service;

import com.reservaturnos.sistema.dto.ResponseDTO;


public interface ITurnosService {

	public ResponseDTO getAll();	
	public ResponseDTO getTurnos(Integer id_comercio, Integer id_servicio);
	
}
