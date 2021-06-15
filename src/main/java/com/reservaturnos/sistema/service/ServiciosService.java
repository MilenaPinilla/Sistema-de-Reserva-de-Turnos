package com.reservaturnos.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reservaturnos.sistema.entity.ServiciosEntity;
import com.reservaturnos.sistema.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServiciosService{

	@Autowired
	private IServiciosRepository serviciosRepository;
	
	
	@Override
	public List<ServiciosEntity> getAll() {
		return serviciosRepository.findAll();
	}

	@Override
	public ServiciosEntity getServiciosById(Integer id_servicio) {
		
		Optional<ServiciosEntity> optional = serviciosRepository.findById(id_servicio);
		
		if (optional.isPresent()) {
			
		return optional.get();	
		} else {
			return null;
		}
		
	}

	@Override
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity) {
		
		return serviciosRepository.save(serviciosEntity);
	}

	@Override
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity) {
	
		return null;
	}

	@Override
	public void deleteServicios(Integer id_servicio) {
		
		serviciosRepository.deleteById(id_servicio);
	}

	



}
