package paquete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Textos {

	public void escribir(String nombreArchivo) {
		File f;// crea un objeto de tipo archivo
		f = new File(nombreArchivo);// Se asigna un nombre al archivo

		// escritura
		try {
			FileWriter w = new FileWriter(f);// FileWriter
			BufferedWriter bw = new BufferedWriter(w);// BufferWriter
			PrintWriter wr = new PrintWriter(bw);// PrintWriter

			wr.write("Texto de prueba en la escritura desde JAVA\nProbando salto de linea en la escritura");
			// wr.append(" - esto una concatenación al texto");
			wr.close();
			bw.close();// Se deben cerrar el flujo de datos de los objeto wr y bw, para que el archivo se guarde y cierre. y así visualizar la información

		} catch (IOException e) {
		}
	}

	public void leer(String nombreArchivo) {

		try {

			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);

			// System.out.println(buffer.readLine());

			String temp = "";

			while (temp != null) {
				temp = buffer.readLine();
				if (temp == null) {
					break;
				}

				// JOptionPane.showMessageDialog(null, temp);
				System.out.println(temp);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
