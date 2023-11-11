package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5LvApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		System.out.println("Soy Luis Valladares");
		System.out.println("cambio en la misma rama");
		System.out.println("cambio en una nueva rama taller 3");
		System.out.println("Taller 4 version 2");
	
	}

}
