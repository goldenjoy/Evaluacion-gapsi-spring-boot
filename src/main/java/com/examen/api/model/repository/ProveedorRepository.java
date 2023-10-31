package com.examen.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.examen.api.model.entity.Proveedor;

@RepositoryRestResource(path = "prov")
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
	
}
