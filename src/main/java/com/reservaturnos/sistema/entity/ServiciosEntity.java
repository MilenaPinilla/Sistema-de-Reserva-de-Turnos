package com.reservaturnos.sistema.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@ManyToOne
	@JoinColumn(name = "id_comercio")
	private ComerciosEntity id_comercio;

	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private String hora_apertura;
	
	@Column(name = "hora_cierre")
	private String hora_cierre;
	
	@Column(name = "duracion")
	private Integer duracion;



	

}
