package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface IInventarioRepository {

	public Inventario seleccionar(String codigo);

	public void insertar(Inventario inventario);

	public void actualizar(Inventario inventario);

	public void eliminar(String codigo);

}
