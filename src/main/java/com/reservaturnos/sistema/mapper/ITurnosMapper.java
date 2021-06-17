package com.reservaturnos.sistema.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.reservaturnos.sistema.dto.TurnosDTO;
import com.reservaturnos.sistema.entity.TurnosEntity;


@Mapper(componentModel = "spring")
public interface ITurnosMapper {
	
	public TurnosDTO entityToDTO(TurnosEntity turnosEntity);
	
	public TurnosEntity dtoToEntity (TurnosDTO turnosDTO);
	
	public List<TurnosDTO> listEntityToDTO(List<TurnosEntity> turnosEntity);
	
	public List<TurnosEntity> listDtoToEntity(List<TurnosDTO> turnosDTO);

}
