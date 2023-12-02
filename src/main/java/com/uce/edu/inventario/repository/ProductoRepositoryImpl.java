package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	private static List<Producto> base = new ArrayList<>();

	@Override
	public Producto seleccionar(String codigoBarras) {
		// TODO Auto-generated method stub
		for (Producto producto : base) {
			if (producto.getCodigoBarras().equals(codigoBarras)) {
				return producto;
			}
		}
		return null;
	}

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		base.add(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.eliminar(producto.getCodigoBarras());
		this.insertar(producto);

	}

	@Override
	public void eliminar(String codigoBarras) {
		// TODO Auto-generated method stub
		Producto producto = this.seleccionar(codigoBarras);
		base.remove(producto);

	}

}
