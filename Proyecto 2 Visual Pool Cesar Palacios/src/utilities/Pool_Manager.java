package utilities;


import java.sql.Connection;
import java.util.ArrayList;


public class Pool_Manager {
	
	public static ArrayList<Connection> cdb = new ArrayList<Connection>();

	public static void createPool() {
		
		for (int i = 0; i < 50; i++) {
			
			cdb.add(Connection_DataBase.getConnection());
			
		}
		
		
	}
	
	public static Connection getConnection() {
		
		if (cdb.isEmpty()) {
			
			return null;
		}else {
			Connection_DataBase d = new Connection_DataBase();
			d.retomopool();
			Connection f = cdb.get(0);
			cdb.remove(0);
			return f;
			
		}
		
	}
	
	public static void returnConnection(Connection conn) {
		
		cdb.add(conn);
		
	}
}
