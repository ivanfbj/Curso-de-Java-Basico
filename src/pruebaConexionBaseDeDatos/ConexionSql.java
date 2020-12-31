package pruebaConexionBaseDeDatos;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ejemplo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1037626026");
			System.out.println("Conexión OK");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();//Comando opcional
			
		} catch(SQLException e) {
			System.out.println("Error en la conexión SQL");
			e.printStackTrace();//Comando opcional
		}
	}
}
