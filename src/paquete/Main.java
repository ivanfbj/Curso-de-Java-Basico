package paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java.io.*; Libreria que se utiliza para entrada y salida de flujos de información de datos, se captura datos del teclado.

public class Main {
	/*
	 * - Leer desde el teclado 
	 * - concat()
	 * - toUpperCase()
	 * - toLowerCase()
	 * - lenght()
	 * - Convertir variables numericas a String y viceversa
	 */
	public static void main(String[] args) {

		String texto = "";

		InputStreamReader in = new InputStreamReader(System.in);// Se abre un flujo o Canal de datos que se reciben desde el exterior
		BufferedReader buffer = new BufferedReader(in);// Espacio de memoria que almacena datos del canal

		// System.out.println("prueba");

		try {
			System.out.println("Ingrese el texto que quiere almacenar en memoria:");

			texto = buffer.readLine();// Este método lee el dato del teclado, lo captura y lo almacena en la variable

		} catch (IOException e) {// Sé que el try catch me permite controlar errores, pero me queda la duda de como se utiliza correctamente.
		}

		System.out.println("Este es el texto que se almacenó en la variable: " + texto);
		
		texto = texto.concat(" -esto es una concatenación, con el método concat(string);");
		
		System.out.println(texto);//imprimir concatenado
		
		
		System.out.println(texto.toUpperCase());//imprimir variable.toUpperCase() me permite convertir todo el texto de una variable en mayúscula
		System.out.println(texto.toLowerCase());//imprimir variable.toLowerCase() me permite convertir todo el texto de una variable en minúscula

		int cantidadCaracteres = texto.length();
		System.out.println("La cantidad de caracteres es: " + cantidadCaracteres);
		
		
	}
}
