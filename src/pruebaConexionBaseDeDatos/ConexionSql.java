package pruebaConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {

	// Se sacan en variables independientes, el controlador la URL de conexión, el usario y la clave
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/bd_ejemplo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER_DB = "root";
	private static final String PASS_DB = "1037626026";

	// Para evitar cargar el controlador cada vez que se intancie el objeto y se llame al metodo "conectar"
	// Deberemos colocar el Class.form que se encarga de llamar al controlador, dentro de un bloque STATIC
	// Esto es debido a que no necesitamos estar cargando el controlador cada vez que llamemos al método "conectar"-
	// Esta carga del controlador lo podemos hacer la primera vez que ejecutemos toda la aplicación, cuando la aplicación independiente que llamemos o no
	// el método "conectar"

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();// Rastreo de pila, en caso de que suceda un error para saber cual fue el origen del error
		}
	}

	// Con este metodo se vuelva la clase más reutilizable
	public Connection conectar() {

		Connection conexion = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			/* Se mueve este gragmento del código al bloque Static */
			// Class.forName(CONTROLADOR);//Se carga el controlador que me permite conectarme a la base de datos de MySql

			conexion = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);// Se establece la conexión con la base de datos, usuario y clave

			System.out.println("Conexión OK");

		}
//		catch (ClassNotFoundException e) {
//			//Estas 2 linea se mueven al ClassNotFoundException del bloque STATIC
//			System.out.println("Error al cargar el controlador");
//			e.printStackTrace();// Comando opcional
//
//		} 
		catch (SQLException e) {
			System.out.println("Error en la conexión SQL");
			e.printStackTrace();// Comando opcional
		}

		return conexion;
	}

}
