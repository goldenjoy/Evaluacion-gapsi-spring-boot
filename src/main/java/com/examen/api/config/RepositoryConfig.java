package com.examen.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.examen.api.model.entity.Proveedor;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	/**
	 * Esta configuracion permite enviar el ID del proveedor
	 * */
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Proveedor.class);
	}
}
