package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connection_DataBase {
	private static String user = "postgres";
	private static String pass= "masterkey";
	private static Statement stmt = null;
	private static PreparedStatement psmst ;
	private static ResultSet rs;
	private static Connection conn = null;
	public static Connection getConnection() { 
		System.out.println("inicando");
		try {
			System.out.println("pendiente");
			
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba",user,pass);

			System.out.println("conecte \n");
		
		}	catch (SQLException e) {
		
			System.out.println("no conecte, vez \n");
				
				e.printStackTrace();
				
			}
		return conn;
	}

	public  void retomopool() {
		sacardatos();
		ingresoDatos();
		
		System.out.println("ingrese datos y saque datos");
	}
	
	public static void sacardatos() {
		try {
			psmst = conn.prepareStatement("SELECT * FROM prueba");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	public static void ingresoDatos()  {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("insert into prueba (columna) values('hola amigo')");
		} catch (SQLException e) {
			
			
		}
	}
	
}
