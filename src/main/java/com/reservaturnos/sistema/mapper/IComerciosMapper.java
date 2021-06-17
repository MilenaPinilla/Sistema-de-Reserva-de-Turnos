package com.reservaturnos.sistema.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.reservaturnos.sistema.dto.ComerciosDTO;
import com.reservaturnos.sistema.entity.ComerciosEntity;


@Mapper(componentModel = "spring")
public interface IComerciosMapper {
	
	public ComerciosDTO entityToDTO(ComerciosEntity comerciosEntity);
	
	public ComerciosEntity dtoToEntity (ComerciosDTO comerciosDTO);
	
	public List<ComerciosDTO> listEntityToDTO(List<ComerciosEntity> comerciosEntity);
	
	public List<ComerciosEntity> listDtoToEntity(List<ComerciosDTO> comerciosDTO);
}
