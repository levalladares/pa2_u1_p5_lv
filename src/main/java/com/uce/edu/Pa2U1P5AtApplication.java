package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.inventario.service.IBodegService;
import com.uce.edu.inventario.service.IInventarioService;
import com.uce.edu.inventario.service.IProductoService;

@SpringBootApplication
public class Pa2U1P5AtApplication implements CommandLineRunner{

	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IBodegService bodegService ;
	
	@Autowired
	private IInventarioService iInventarioService ;
	
	public static void main(String[] args)  {
		SpringApplication.run(Pa2U1P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto p1 = new Producto();
		p1.setCodigoBarras("12345");
		p1.setNombre("HP 15 laptop");
		p1.setStock(0);
		this.iProductoService.guardar(p1);
		
		Producto p2 = new Producto();
		p2.setCodigoBarras("144445");
		p2.setNombre("Dell 15 laptop");
		p2.setStock(0);
		this.iProductoService.guardar(p2);
		
		Bodega bodega1 = new Bodega();
		bodega1.setCapacidad(100);
		bodega1.setCodigo("12345678");
		bodega1.setNombre("Bodega la gasca");
		bodega1.setDireccion("La gasca y america");
		
		this.iInventarioService.registrar("12345678", "12345", 50);
		System.out.println(p1);
		
		this.iInventarioService.registrar("12345678", "144445", 100);
		System.out.println(p2);
		
		this.iInventarioService.registrar("12345678", "12345", 20);
		System.out.println(p1);
		
		
		
		
		
	}

}
