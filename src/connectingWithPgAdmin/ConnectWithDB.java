package connectingWithPgAdmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectWithDB {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");
		 String dbURL = "jdbc:postgresql://localhost:5432/vojvoj-qa";
		 String username = "postgres";
		 String password = "#Zenitus@27";
		Connection connection = DriverManager.getConnection(dbURL, username, password );
		System.out.println("Connection established with DataBase");

	}

}
