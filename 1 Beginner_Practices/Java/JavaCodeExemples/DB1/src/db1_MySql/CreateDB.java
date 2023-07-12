package db1_MySql;

import java.sql.*;

public class CreateDB {

	public static void main(String[] args) {
		try {
		String url = "jdbc:mysql://localhost:3306/";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS EMP");
		
		stmt.close();
		con.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
