package com.reservaturnos.sistema.service;


import com.reservaturnos.sistema.dto.ComerciosDTO;
import com.reservaturnos.sistema.dto.ResponseDTO;



public interface IComerciosService {

	public ResponseDTO getAll();
	
	public ResponseDTO getComerciosById(Integer id_comercio);
	
	public ResponseDTO createComercios(ComerciosDTO comerciosDTO);
	
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO);
	
	public ResponseDTO deleteComercios(Integer id_comercio);

	
}
