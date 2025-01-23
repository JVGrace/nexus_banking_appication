package bank.management.system;

import java.sql.*;

public class ConnectionDB {
	Connection connection;
	Statement statement;

	public ConnectionDB() {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nexusBank", "root", "Pradumn2924@bam");
			statement=connection.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
