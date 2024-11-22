package org.iesch.ad.busqueda;

import org.iesch.ad.busqueda.servicio.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusquedaApplication implements CommandLineRunner {

	@Autowired
	DataService dataService;

	public static void main(String[] args) {
		SpringApplication.run(BusquedaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		dataService.crearDatos();

		dataService.testLazy();

	}
}
