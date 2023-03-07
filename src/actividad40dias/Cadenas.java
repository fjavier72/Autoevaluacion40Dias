package actividad40dias;

/**
 * 
 * @author Francisco Javier Patón Noblejas
 *
 */

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos la variable y la inicializamos
		String cadena = "Siempre se puede aprender java";
		String[] palabras = cadena.split(" ");  // Dividimos la frase por palabras para facilitar los cálculos
	
		// Mostramos los resultados del ejercicio por pantalla...
		System.out.println("Vamos a jugar con la cadena \"" + cadena + "\"");
		
		// ...primero contamos cuantas letras tiene la frase...
		int cuantasLetras = 0;
		for (String string : palabras) {
			cuantasLetras += string.length();
		}
		System.out.print("Esta cadena consta de " + cuantasLetras + " letras, ");
		
		// ...a continuación mostramos el número de palabras que tiene...
		System.out.print("tiene " + palabras.length + " palabras y ");
		
		// ...y por último mostramos cuantas letas 'a' tiene
		int cuantasA = 0;
		for (String string : palabras) {
			if (string.contains("a")) {  // Si la palabra no contiene ninguna 'a', no hace ningún cálculo y nos ahorramos recorrer todas las palabras
				for (int i = 0; i < string.length(); i++) {
					if (string.charAt(i) == 'a') {
						cuantasA++;
					}
				}
			}
		}
		System.out.println("tiene " + cuantasA + " letras 'a'");
	}

}
