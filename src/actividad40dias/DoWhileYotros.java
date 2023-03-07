package actividad40dias;

/**
 * @author Francisco Javier Patón Noblejas
 */

import java.util.Scanner;

public class DoWhileYotros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaración de variables y objetos
		Scanner input = new Scanner(System.in);
		int opcion;
		
		// Mostramos el menú y solicitamos al usuario la entrada de una opción
		do {
			System.out.println("\nMenú Principal");
			System.out.println("--------------");
			System.out.println("\t1. Alta");
			System.out.println("\t2. Baja");
			System.out.println("\t3. Modificación");
			System.out.println("\t4. Eliminación");
			System.out.println("\t5. Mostrar");
			System.out.println("\t6. Salir");
			System.out.print("\nSELECCIONE UNA OPCIÓN: ");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1 -> System.out.println(alta(opcion));
			case 2 -> System.out.println(baja(opcion));
			case 3 -> System.out.println(modificacion(opcion));
			case 4 -> System.out.println(eliminacion(opcion));
			case 5 -> System.out.println(mostrar(opcion));
			case 6 -> System.out.println("Aplicación terminada...");
			default -> System.out.println("Entrada no válida");
			}
		} while (opcion != 6);
		
		// Cerramos el objeto de la clase Scanner
		input.close();
	}
	
	public static String alta(int opcion) {
		String salida = "Hecho " + opcion;
		return salida;
	}
	
	public static String baja(int opcion) {
		String salida = "Hecho " + opcion;
		return salida;
	}
	
	public static String modificacion(int opcion) {
		String salida = "Hecho " + opcion;
		return salida;
	}
	
	public static String eliminacion(int opcion) {
		String salida = "Hecho " + opcion;
		return salida;
	}
	
	public static String mostrar(int opcion) {
		String salida = "Hecho " + opcion;
		return salida;
	}

}
