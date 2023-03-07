package actividad40dias;

import java.util.Scanner;

/**
 * 
 * @author Francisco Javier Patón Noblejas
 *
 */

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables y objetos
		Scanner input = new Scanner(System.in);
		int numero;
		int contador = 1;
		
		// Solicitamos al usuario un número
		System.out.println("Vamos a ver una secuencia numérica desde 1 hasta N");
		System.out.print("Introduzca un número mayor que 1: ");
		numero = input.nextInt();
		
		// Mostramos el resultado por pantalla
		while (contador <= numero) {
			System.out.print(contador + " ");
			contador++;
		}
		
		// Cerramos el objeto de la clase Scanner
		input.close();
	}

}
