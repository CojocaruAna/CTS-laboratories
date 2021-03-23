package ro.ase.csie.cts.g1092.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
DBConnection dbConn1 = DBConnection.getDBConnection("127.0.0.1", "localDB");
		
		DBConnection dbConn2 = DBConnection.getDBConnection("127.0.0.1", "localDB");

		DBConnection dbConn3 = DBConnection.getDBConnection("10.0.0.1", "prodDb");

		if(dbConn1 == dbConn2) {
			System.out.println("They are the same object");
		}
		
		if(dbConn1 != dbConn3) {
			System.out.println("They are different");
		}
	}

}
