package com.reservaturnos.sistema.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.reservaturnos.sistema.entity.ServiciosEntity;
import lombok.Data;

@Data
public class TurnosDTO {

	private Integer id_turno;
	
	private ServiciosEntity id_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd",timezone = "America/New_York")
	private Date fecha_turno;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss",timezone = "America/New_York")
	private Date hora_inicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss",timezone = "America/New_York")
	private Date hora_fin;

	private String estado;
}
