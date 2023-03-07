package com.cursoceat.controller;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Francisco Javier Patón Noblejas
 */

import com.cursoceat.model.Articulo;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos el objeto
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		// Manos a la obra...
		System.out.println("Vamos a comprobar el buen funcionamiento de nuestra clase 'Articulo', creando dos artículos\n");
		// Creamos dos objetos de nuestra clase para probar el buen funcionamiento de la 'referenciaGeneral'
		Articulo miArticulo1 = new Articulo();
		Articulo miArticulo2 = new Articulo();
		// y lo probamos...
		System.out.print("Introduzca el nombre del primer artículo: ");
		miArticulo1.setNombre(input.nextLine());
		System.out.print("Introduzca el precio del primer artículo: ");
		miArticulo1.setPrecio(input.nextDouble());
		input.nextLine();  // Vaciamos el buffer del Scanner
		System.out.println();
		System.out.print("Introduzca el nombre del segundo artículo: ");
		miArticulo2.setNombre(input.nextLine());
		System.out.print("Introduzca el precio del segundo artículo: ");
		miArticulo2.setPrecio(input.nextDouble());
		System.out.println();
		System.out.println("Este es nuestro primer artículo");
		System.out.println("Nombre: " + miArticulo1.getNombre());
		System.out.printf("Referencia: %08d\n", miArticulo1.getReferenciaArtículo());  // Formateamos para 8 dígitos para que parezca una referencia real
		System.out.println("Precio: " + miArticulo1.getPrecio() + " €");
		System.out.println();
		System.out.println("Este es nuestro segundo artículo");
		System.out.println("Nombre: " + miArticulo2.getNombre());
		System.out.printf("Referencia: %08d\n", miArticulo2.getReferenciaArtículo());  // Formateamos para 8 dígitos para que parezca una referencia real
		System.out.println("Precio: " + miArticulo2.getPrecio() + " €");
		
		// Cerramos el objeto de la clase Scanner
		input.close();
	}

}
