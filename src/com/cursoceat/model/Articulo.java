package com.cursoceat.model;

public class Articulo {

	// Atributos
	private String nombre;
	private double precio;
	private static int referenciaGeneral = 0;
	private int referenciaArtículo;
	
	
	// Constructor
	public Articulo() {
		referenciaArtículo = ++referenciaGeneral;
	}

	// Setter y Getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getReferenciaArtículo() {
		return referenciaArtículo;
	}
	
}
