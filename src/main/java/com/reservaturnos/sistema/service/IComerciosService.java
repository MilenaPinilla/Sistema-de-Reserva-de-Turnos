package com.reservaturnos.sistema.service;

import java.util.List;
import com.reservaturnos.sistema.entity.ComerciosEntity;


public interface IComerciosService {

	public List<ComerciosEntity> getAll();
	
	public ComerciosEntity getComerciosById(Integer id_comercio);
	
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity);
	
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity);
	
	public void deleteComercios(Integer id_comercio);

	
}
