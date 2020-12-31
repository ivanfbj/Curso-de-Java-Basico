package pruebaConexionBaseDeDatos;

public class TestConexionASql {

	public static void main(String[] args) {
		
		ConexionSql conexionDataBase = new ConexionSql();//Se instancia un objeto de tipo ConexionSQL, para poder establecer la conexión con la base de datos
		conexionDataBase.conectar();//El metodo conectar es reutilizable y ya se puede llamar desde la otra clase
	
	
	}
}
