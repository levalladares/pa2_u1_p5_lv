package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface IProductoRepository {
	
	public Producto seleccionar(String codigoBarras);

	public void insertar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(String codigoBarras);

}
