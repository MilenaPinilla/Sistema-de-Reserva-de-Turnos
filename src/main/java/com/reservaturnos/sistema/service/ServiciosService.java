package com.reservaturnos.sistema.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.reservaturnos.sistema.dto.ResponseDTO;
import com.reservaturnos.sistema.dto.ServiciosDTO;
import com.reservaturnos.sistema.entity.ServiciosEntity;
import com.reservaturnos.sistema.mapper.IServiciosMapper;
import com.reservaturnos.sistema.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServiciosService{

	@Autowired
	private IServiciosRepository serviciosRepository;

	@Autowired
	private IServiciosMapper serviciosMapper;


	@Override
	public ResponseDTO getAll() {

		return new ResponseDTO( serviciosMapper.listEntityToDto( serviciosRepository.findAll()), true, "ok", HttpStatus.OK);
	}


	@Override
	public ResponseDTO getServiciosById(Integer id_servicio) {


		Optional<ServiciosEntity> optional = serviciosRepository.findById(id_servicio);

		if (optional.isPresent()) {

			return  new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK); 

		}else {
			return  new ResponseDTO(null, false, "usuario no encontrado", HttpStatus.OK); 
		}

	}

	@Override
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO) {

		try {

			ServiciosEntity serviciosEntity = serviciosMapper.dtoToEntity(serviciosDTO);

			serviciosRepository.save(serviciosEntity);


			return new ResponseDTO(serviciosMapper.entityToDTO(serviciosEntity), true, "ok", HttpStatus.OK); 
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se puede crear el usuario", HttpStatus.OK); 
		}

	}



	@Override
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO) {

		ServiciosEntity serviciosEntity =serviciosMapper.dtoToEntity(serviciosDTO);

		serviciosRepository.save(serviciosEntity);

		return new ResponseDTO(serviciosMapper.entityToDTO(serviciosEntity), true, "ok", HttpStatus.OK);
	}


	@Override
	public ResponseDTO deleteServicios(Integer id_servicio) {


		try {
			serviciosRepository.deleteById(id_servicio);


			return  new ResponseDTO(null, true, "usuario eliminado", HttpStatus.OK); 

		}catch (Exception e) {


			return  new ResponseDTO(null, false, "el usuario no se puede eliminar", HttpStatus.OK); 
		}


	}


}


