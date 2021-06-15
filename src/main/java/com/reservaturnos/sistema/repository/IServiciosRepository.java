package com.reservaturnos.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reservaturnos.sistema.entity.ServiciosEntity;


public interface IServiciosRepository extends JpaRepository<ServiciosEntity, Integer> {

}
