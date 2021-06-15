package com.reservaturnos.sistema.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reservaturnos.sistema.entity.TurnosEntity;
import com.reservaturnos.sistema.repository.ITurnosRepository;

@Service
public class TurnosService implements ITurnosService {
	
	@Autowired
	private ITurnosRepository turnosRepository;

	@Override
	public List<TurnosEntity> getAll() {
		return turnosRepository.findAll();
	}
	@Override
	public List<TurnosEntity> getTurnos(Integer id_comercio, Integer id_servicio) {
		return turnosRepository.findByComercioyServicio(id_comercio, id_servicio);
	}
	

}