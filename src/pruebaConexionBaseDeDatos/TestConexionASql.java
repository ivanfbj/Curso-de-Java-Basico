package pruebaConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexionASql {

	public static void main(String[] args) {

		ConexionSql conexionDataBase = new ConexionSql();// Se instancia un objeto de tipo ConexionSQL, para poder establecer la conexión con la base de datos

		Connection cn = null;// Instanciar un objeto de la clase Connection
		// Para crear sentencias SQL necesitamos un objeto de la clase Statement
		Statement stm = null;
		//El resultado de una sentecia de SQL como el Selet * from usuario, se debe almacenar en un objeto de la clase ResultSet
		ResultSet rs = null;
		
		
		// conexionDataBase.conectar();// El metodo conectar es reutilizable y ya se puede llamar desde la otra clase

// La Connection "cn" y el Statement "stm" debe ir en un bloque TRY CATCH con un exception de tipo SQL exception
//		cn = conexionDataBase.conectar();// Al objeto de la clase "Connection" se le asignar el valor de la conexión establcidad con la base de datos, generada con el metodo "conectar()"
//
//		/*
//		 * Para crear mi objeto "Statement", llamo mi objeto de la clase "Connection" y seleccióno el metodo "creteStatement" El resultado de esto se lo
//		 * asigno a mi objeto de la clase Statement
//		 */
//		stm = cn.createStatement();

		
		try {
			cn = conexionDataBase.conectar();
			stm = cn.createStatement();
			
			String queryInsert = "INSERT INTO usuario (usuario, clave) VALUES ('King', '1597-4')";
			PreparedStatement preparedStmt = cn.prepareStatement(queryInsert);
			preparedStmt.execute();
			preparedStmt.close();
			
			PreparedStatement preparedStmt2 = cn.prepareStatement("DELETE FROM usuario where idusuario=30");
			preparedStmt2.execute();
			preparedStmt2.close();
			
			PreparedStatement preparedStmt3 = cn.prepareStatement("UPDATE usuario SET clave='111' where idusuario=27");
			preparedStmt3.execute();
			preparedStmt3.close();
			
			
			PreparedStatement preparedStmt4 = cn.prepareStatement("INSERT INTO usuario (usuario, clave) VALUES (?,?)");
			String nomObject="Meliodas";
			String clavObject="7777777";
			
			preparedStmt4.setString(1, nomObject);
			preparedStmt4.setString(2, clavObject);
			
			preparedStmt4.execute();
			preparedStmt4.close();
			
			
			//stm.executeQuery("select * from usuario");//El resultado de este query tengo que asignarlo a un objeto de la clase ResultSet
			rs = stm.executeQuery("select * from usuario");
			
			//Para mostrar los datos del objeto "rs" de la clase ResultSet, debo hacer un recorrido por la tabla e ir mostrandolos en consola.
			while (rs.next()) {//Para posicionarme en cada fila debo utilizar el método next() del objeto ResultSet, siempre que haya una fila por mostrar este metodo será verdadero y se seguirá ejecutando
				//Para ingresar a cada columna se puede hacer de dos formas
				//La primera forma es guardar en una variable el valor de dicha columna de cada fila
				int idUsuario = rs.getInt(1);
				String usuario =  rs.getString(2);
				String clave = rs.getString(3);
				
				System.out.println(idUsuario + " - " + usuario + " - " + clave);
				
			}
			
		} catch (SQLException e) {

		} finally {//Es muy util porque se ejecuta siempre y es utilizado para liberar recursos
			//Los recursos que se van a liberar son: el objeto ResultSet, el objeto Statement y el objeto Connection
			//El método que me permite cerrar esto es el método close() y el método close necesita ser encerrado en un TRY CATCH con la Exception SQLException
			try {
				if (rs!=null) {
					rs.close();
				}
				if(stm !=null) {
					stm.close();
				}
				if(cn!=null) {
					cn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();// Rastreo de pila, en caso de que suceda un error para saber cual fue el origen del error
			}
		}
		
	}
}
