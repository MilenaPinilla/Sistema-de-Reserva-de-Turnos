package com.reservaturnos.sistema.dto;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.reservaturnos.sistema.entity.ComerciosEntity;

import lombok.Data;

@Data
public class ServiciosDTO {


	private Integer id_servicio;
	
	private ComerciosEntity id_comercio;

	private String nom_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss",timezone = "America/New_York")
	private Date hora_apertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss",timezone = "America/New_York")
	private Date hora_cierre;
	
	private Integer duracion;
}
