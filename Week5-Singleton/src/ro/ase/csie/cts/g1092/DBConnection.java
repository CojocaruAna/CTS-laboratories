package ro.ase.csie.cts.g1092;

public class DBConnection {
	String socket;
	String schema;
	
	
	private static DBConnection dbConnection = null;
	
	
	static {
		
		System.out.println("Loading database connection string");
	}
	
	
	{
		
		System.out.println("Init connection string");
	}
	            
	private DBConnection() {
		System.out.println("Creating a DB connection");
		
		
	}

	private DBConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	
	public static DBConnection getConnection() {
		if(DBConnection.dbConnection == null) {
			
			dbConnection = new DBConnection();
		}
		return DBConnection.dbConnection;
	}
	
	public static DBConnection getConnection(String socket, String schema) {
		if(DBConnection.dbConnection == null) {
			dbConnection = new DBConnection(socket, schema);
		}
		
		if(!socket.equals(dbConnection.socket) || !schema.equals(dbConnection.schema)) {
			throw new UnsupportedOperationException("You already have an opened connection to a different database");
		}
		return DBConnection.dbConnection;
	}
 
}
