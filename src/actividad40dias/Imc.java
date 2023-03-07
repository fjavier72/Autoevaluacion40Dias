package actividad40dias;

/**
 * @author Francisco Javier Patón Noblejas
 */

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaración de variables y objetos
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);  // Utilizaremos el punto decimal
		double peso, estatura, imc;
		
		// Solicitamos los datos al usuario
		System.out.println("Este programa le ayudará a calcular su IMC");
		System.out.print("Introduzca su peso: ");
		peso = input.nextDouble();
		System.out.print("Introduzca su altura: ");
		estatura = input.nextDouble();
		
		// Hacemos los cálculos
		imc = peso / Math.pow(estatura, 2);
		
		// Mostramos los resultados por pantalla
		System.out.printf("Si IMC es: %.2f\n", imc);
		if (imc < 18.5)
			System.out.println("Su peso es demasiado bajo");
		else if (imc >= 18.5 && imc <= 24.9)
			System.out.println("¡Enhorabuena! Tiene un peso normal");
		else if (imc >= 25 && imc <=29.9)
			System.out.println("Tiene sobrepeso. Debe cuidar su alimentación");
		else if (imc >= 30)
			System.out.println("Tiene obesidad. Debe cuidar su alimentación y hacer ejercicio");
		
		// Cerramos el objeto de la clase Scanner
		input.close();
	}

}
