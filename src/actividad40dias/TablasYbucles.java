package actividad40dias;

import java.util.Scanner;

/**
 * 
 * @author Francisco Javier Patón Noblejas
 *
 */

public class TablasYbucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables y objetos
		Scanner input = new Scanner(System.in);
		int[] tabla = new int[10];
		
		// Solicitamos al usuario los números
		System.out.println("Vamos a crear una tabla con 10 números enteros");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca el " + (i+1) + "º número: ");
			tabla[i] = input.nextInt();
		}
		
		// Mostramos el resultado en pantalla
		System.out.println("Los número introducidos son (del primero que se insertó al último)");
		for (int i : tabla)
			System.out.print(i + " ");
		
		// Cerramos el objeto de la clase Scanner
		input.close();
	}

}
