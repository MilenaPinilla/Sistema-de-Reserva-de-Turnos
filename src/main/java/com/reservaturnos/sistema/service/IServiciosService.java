package com.reservaturnos.sistema.service;

import java.util.List;
import com.reservaturnos.sistema.entity.ServiciosEntity;


public interface IServiciosService {
	
	public List<ServiciosEntity> getAll();
	
	public ServiciosEntity getServiciosById(Integer id_servicio);
	
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity);
	
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity);
	
	public void deleteServicios(Integer id_servicio);
	
}
