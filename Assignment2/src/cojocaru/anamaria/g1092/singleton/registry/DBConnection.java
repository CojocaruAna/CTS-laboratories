package cojocaru.anamaria.g1092.singleton.registry;

import java.util.HashMap;


public class DBConnection {
	String socket;
	String schema;
	
	private static HashMap<String, DBConnection> connections = new HashMap<>();
	
	private DBConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	public static DBConnection getDBConnection(String socket, String schema) {
		
		DBConnection connection = connections.get(socket);
		if(connection == null) {
			connection = new DBConnection(socket, schema);
			connections.put(socket, connection); 
		}
		return connection;
	}
}
