package com.app.web.crud2;

import com.app.web.crud2.Repositorio.EstudianteRepositorio;
import com.app.web.crud2.entidad.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Crud2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Crud2Application.class, args);
	}
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante1 = new Estudiante("Daniel" , "Rojas" , "dan26@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Camila" , "Guzman" , "camgz@gmail.com");
		repositorio.save(estudiante2);
	}
}
