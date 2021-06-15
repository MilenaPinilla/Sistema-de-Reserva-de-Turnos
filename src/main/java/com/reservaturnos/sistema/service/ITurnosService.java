package com.reservaturnos.sistema.service;
import java.util.List;
import com.reservaturnos.sistema.entity.TurnosEntity;


public interface ITurnosService {

	public List<TurnosEntity> getAll();	
	public List<TurnosEntity> getTurnos(Integer id_comercio, Integer id_servicio);
	
}
