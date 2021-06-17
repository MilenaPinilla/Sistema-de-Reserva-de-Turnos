package com.reservaturnos.sistema.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.reservaturnos.sistema.dto.ComerciosDTO;
import com.reservaturnos.sistema.dto.ResponseDTO;
import com.reservaturnos.sistema.entity.ComerciosEntity;
import com.reservaturnos.sistema.mapper.IComerciosMapper;
import com.reservaturnos.sistema.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService{

	
	@Autowired
	private IComerciosRepository comerciosRepository;
	
	@Autowired
	private IComerciosMapper comerciosMapper;
	
	
	@Override
	public ResponseDTO getAll() {
	
		return new ResponseDTO( comerciosMapper.listEntityToDTO(comerciosRepository.findAll()), true, "ok", HttpStatus.OK);
		
	}

	@Override
	public ResponseDTO getComerciosById(Integer id_comercio) {
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id_comercio);

		if (optional.isPresent()) {

			return  new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK); 

		}else {
			return  new ResponseDTO(null, false, "usuario no encontrado", HttpStatus.OK); 
		}
		
	}
		
	@Override
	public ResponseDTO createComercios(ComerciosDTO comerciosDTO) {
		
		try {

			ComerciosEntity comerciosEntity = comerciosMapper.dtoToEntity(comerciosDTO);

			comerciosRepository.save(comerciosEntity);


			return new ResponseDTO(comerciosMapper.entityToDTO(comerciosEntity), true, "ok", HttpStatus.OK); 
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se puede crear el usuario", HttpStatus.OK); 
		}
	
	}

	@Override
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO) {
	

		ComerciosEntity comerciosEntity = comerciosMapper.dtoToEntity(comerciosDTO);

		comerciosRepository.save(comerciosEntity);

		return new ResponseDTO(comerciosMapper.entityToDTO(comerciosEntity), true, "ok", HttpStatus.OK);
	
	}

	@Override
	public ResponseDTO deleteComercios(Integer id_comercio) {
		try {
			comerciosRepository.deleteById(id_comercio);


			return  new ResponseDTO(null, true, "usuario eliminado", HttpStatus.OK); 

		}catch (Exception e) {


			return  new ResponseDTO(null, false, "el usuario no se puede eliminar", HttpStatus.OK); 
		}

	}


}
