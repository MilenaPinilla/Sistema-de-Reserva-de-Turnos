package com.reservaturnos.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reservaturnos.sistema.entity.ComerciosEntity;
import com.reservaturnos.sistema.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService{

	
	@Autowired
	private IComerciosRepository comerciosRepository;
	
	
	@Override
	public List<ComerciosEntity> getAll() {
		return comerciosRepository.findAll();
	}

	@Override
	public ComerciosEntity getComerciosById(Integer id_comercio) {
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id_comercio);
		
		if (optional.isPresent()) {
			
		return optional.get();	
		} else {
			return null;
		}
		
	}

	@Override
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity) {
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity) {
		return null;
	}

	@Override
	public void deleteComercios(Integer id_comercio) {
		
		comerciosRepository.deleteById(id_comercio);
	}


}
