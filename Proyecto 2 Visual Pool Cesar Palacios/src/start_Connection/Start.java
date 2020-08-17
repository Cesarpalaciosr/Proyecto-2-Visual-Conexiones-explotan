package start_Connection;
import utilities.Pool_Manager;
import utilities.Threads;;
public class Start {

	public static void main(String[] args) {
		
		Pool_Manager.createPool();
		
		Threads[] h =  new Threads[10000];
		for (int i = 0; i < 10000; i++) {
			h[i]= new Threads(i);
		}
		
		//debuggee con la talla del array para comprobar su tamaño
		System.out.println(Pool_Manager.cdb.size());
	}

}
