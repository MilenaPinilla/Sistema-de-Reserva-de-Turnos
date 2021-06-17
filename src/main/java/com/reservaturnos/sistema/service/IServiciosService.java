package com.reservaturnos.sistema.service;

import com.reservaturnos.sistema.dto.ResponseDTO;
import com.reservaturnos.sistema.dto.ServiciosDTO;



public interface IServiciosService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO getServiciosById(Integer id_servicio);
	
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO deleteServicios(Integer id_servicio);
	
}
