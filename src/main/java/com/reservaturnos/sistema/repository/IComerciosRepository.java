package com.reservaturnos.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reservaturnos.sistema.entity.ComerciosEntity;

public interface IComerciosRepository extends JpaRepository<ComerciosEntity, Integer> {

}
