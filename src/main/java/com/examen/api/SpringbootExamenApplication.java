package com.examen.api;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class SpringbootExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExamenApplication.class, args);
	}
	
	/**
	 * El bean simpleCorsFilter permite que los servicoos puedan ser 
	 * consumidos desde un front como React 
	 * */
	@Bean
	public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
	    CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
	    config.setAllowedOrigins(Collections.singletonList("http://localhost:5173"));
	    config.setAllowedMethods(Collections.singletonList("*"));
	    config.setAllowedHeaders(Collections.singletonList("*"));
	    

	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", config);
	    
	    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
	}

}
