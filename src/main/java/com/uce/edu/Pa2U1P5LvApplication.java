package com.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

@SpringBootApplication
public class Pa2U1P5LvApplication implements CommandLineRunner
{

	
	@Autowired
	private Materia materia;
	
	@Autowired
	private Materia materia2;
	
	@Autowired
	private Materia materia3;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.materia.setNombre("Avanzada II");
		System.out.println(this.materia);
		
		System.out.println(this.materia2);
		
		this.materia2.setNombre("nuevo nombre");
		System.out.println(this.materia2);
		System.out.println(this.materia);
		
		this.materia3.setNombre("nombre final");
		System.out.println(this.materia3);
		System.out.println(this.materia2);
		System.out.println(this.materia);

	}

}
