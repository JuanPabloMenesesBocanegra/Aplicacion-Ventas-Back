package com.ventas.ventas;


import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VentasApplication {

	private static final Logger logger = LoggerFactory.getLogger(VentasApplication.class);

	public static void main(String[] args) {
		logger.trace("Mensaje de rastreo");
		logger.debug("Mensaje de Depuracion");
		logger.info("Mensaje de Informacion");
		logger.warn("Mensaje de Advertencia");
		logger.error("Mensaje de Error");
		SpringApplication.run(VentasApplication.class, args);
	}

}
