package actividad40dias;

/**
 * @author Francisco Javier Patón Noblejas
 */

import java.util.Locale;
import java.util.Scanner;

public class CambioEuroDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaración del objeto de la clase Scanner
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);  // Utilizaremos el punto decimal para la entrada de datos
		// El valor del dólar canadiense lo metemos en una constante
		final double VALOR_DOLLAR = 1.02;
		// Declaramos el resto de variables
		double euros, valorAlCambio;
		String valorAlCambioString;
		
		// Solicitamos el dato al usuario
		System.out.print("Introduzca el importe en euros: ");
		euros = input.nextDouble();
		// Realizamos el cálculo
		valorAlCambio = euros * VALOR_DOLLAR;
		// Transformamos nuestra variable 'valorAlCambio' de double a String
		valorAlCambioString = Double.toString(valorAlCambio);
		// Mostramos el resultado por pantalla
		System.out.println("El valor de la cantidad introducida en dólares canadienses es: " + valorAlCambioString);
		// Cerramos el objeto de la clase Scanner
		input.close();
	}

}
