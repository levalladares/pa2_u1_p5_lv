package com.uce.edu.repository.modelo;

public class Materia {
	private String nombre;
	private String codigo;
	private Integer numeroCreditos;
	
	

	//TO STRING
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos + "]";
	}
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

}
