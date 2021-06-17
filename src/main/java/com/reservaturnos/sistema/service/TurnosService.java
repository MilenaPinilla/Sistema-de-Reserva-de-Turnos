package com.reservaturnos.sistema.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.reservaturnos.sistema.dto.ResponseDTO;
import com.reservaturnos.sistema.mapper.ITurnosMapper;
import com.reservaturnos.sistema.repository.ITurnosRepository;

@Service
public class TurnosService implements ITurnosService {
	
	@Autowired
	private ITurnosRepository turnosRepository;
	
	@Autowired
	private ITurnosMapper turnosMapper;

	@Override
	public ResponseDTO getAll() {

		return new ResponseDTO( turnosMapper.listEntityToDTO( turnosRepository.findAll()), true, "ok", HttpStatus.OK);
		
	}
	@Override
	public ResponseDTO getTurnos(Integer id_comercio, Integer id_servicio) {
		
		//TurnosEntity turnosEntity = turnosMapper.dtoToEntity(turnosDTO);
		
		//return (ResponseDTO) turnosRepository.findByComercioyServicio(id_comercio, id_servicio);
		return new ResponseDTO( turnosMapper.listEntityToDTO( turnosRepository.findByComercioyServicio(id_comercio, id_servicio)), true, "ok", HttpStatus.OK);
	}
	

}