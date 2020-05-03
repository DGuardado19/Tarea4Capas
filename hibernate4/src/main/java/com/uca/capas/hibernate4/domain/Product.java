package com.uca.capas.hibernate4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	@Pattern(regexp="[0-9]{12}", message="El codigo debe ser exactamente de 12 digitos.")
	private String codigo;
	@Size(min=1, max=100, message="El nombre debe tener entre 1 y 100 caracteres.")
	private String nombre;
	@Size(min=1, max=100, message="La marca debe tener entre 1 y 100 caracteres.")
	private String marca;
	@Size(min=1, max=500, message="La descripcion puede contener de 1 a 500 caracteres.")
	private String descripcion;
	@Digits(integer = 100, fraction=0, message="Los decimales no estan contemplados.")
	private String existencias;
	@Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", 
			message="La fecha debe ser dd/mm/yyyy")
	private String fechaIngreso;
	
	public Product() {
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
