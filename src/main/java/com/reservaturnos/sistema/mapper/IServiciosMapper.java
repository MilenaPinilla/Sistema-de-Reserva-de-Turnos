package com.reservaturnos.sistema.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.reservaturnos.sistema.dto.ServiciosDTO;
import com.reservaturnos.sistema.entity.ServiciosEntity;


@Mapper(componentModel = "spring")
public interface IServiciosMapper {
	
	public ServiciosDTO entityToDTO(ServiciosEntity serviciosEntity);
	
	public ServiciosEntity dtoToEntity (ServiciosDTO serviciosDTO);
	
	public List<ServiciosDTO> listEntityToDTO(List<ServiciosEntity> serviciosEntity);
	
	public List<ServiciosEntity> listDtoToEntity(List<ServiciosDTO> serviciosDTO);
}
