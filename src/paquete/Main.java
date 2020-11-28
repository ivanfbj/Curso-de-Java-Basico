package paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java.io.*; Libreria que se utiliza para entrada y salida de flujos de información de datos, se captura datos del teclado.

public class Main {
	/*
	 * - Leer desde el teclado - concat() - toUpperCase() - toLowerCase() - lenght() - Convertir variables numericas a String y viceversa
	 */
	public static void main(String[] args) {

		String texto = "";
		int x = 0;

		InputStreamReader in = new InputStreamReader(System.in);// Se abre un flujo o Canal de datos que se reciben desde el exterior
		BufferedReader buffer = new BufferedReader(in);// Espacio de memoria que almacena datos del canal

		// System.out.println("prueba");

		try {
			System.out.println("Ingrese el texto que quiere almacenar en memoria:");

			texto = buffer.readLine();// Este método lee el dato del teclado, lo captura y lo almacena en la variable
			x = Integer.parseInt(texto);

		} catch (Exception e) {// En caso de que se genere error mostrará la información del Catch
			System.out.println("Debes escribir un número");

		}
		
		System.out.println(x + 5);

	}
}
