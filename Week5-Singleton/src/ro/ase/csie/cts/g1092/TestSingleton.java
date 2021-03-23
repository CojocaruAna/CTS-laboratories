package ro.ase.csie.cts.g1092;

public class TestSingleton {

	public static void main(String[] args) {
System.out.println("The app started");
		
		//  multiple objects
		// DBConnection connection1 = new DBConnection();
		// DBConnection connection2 = new DBConnection();
		
		//references to the same object
		DBConnection con1 = DBConnection.getConnection();
		DBConnection con2 = DBConnection.getConnection();
		DBConnection con3 = DBConnection.getConnection();

		
		if(con1 == con2 && con2 == con3) {
			System.out.println("They are referencing the same object");
		}
		
		
		DBConnection con4 = DBConnection.getConnection("10.0.0.1:3306","ctsDB");
		
		
		if(con1 == con4) {
			System.out.println("They are referencing the same object");
		}
		
		
		DBConnection con5 = DBConnection.getConnection("10.0.0.1:3306","cts_prod");
		
	}
	

}
