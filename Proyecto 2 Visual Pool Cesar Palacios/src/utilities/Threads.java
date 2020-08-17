package utilities;

import java.sql.Connection;

public class Threads extends Thread {
	 public int n;
	
	public Threads(int i) {
		run();	 
		 n=i;
	 }
	 public void run() {
				Connection conn = Pool_Manager.getConnection();
				if (conn == null) {
					try {
						System.out.println("espero conexion");
						Threads.sleep(150);
						
					} catch (InterruptedException e) {
					e.printStackTrace();						
					}
				}	else {
						System.out.println("Conexion establecida");
						Pool_Manager.returnConnection(conn);
					}
	
	 }
		
		

}

