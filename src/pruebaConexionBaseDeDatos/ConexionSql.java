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

	// Con este metodo se vuelva la clase más reutilizable
	public Connection conectar() {

		Connection conexion = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName(CONTROLADOR);//Se carga el controlador que me permite conectarme a la base de datos de MySql

			conexion = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);//Se establece la conexión con la base de datos, usuario y clave

			System.out.println("Conexión OK");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();// Comando opcional

		} catch (SQLException e) {
			System.out.println("Error en la conexión SQL");
			e.printStackTrace();// Comando opcional
		}

		return conexion;
	}

}
