package db1_MySql;

import java.sql.*;

public class CreateTableAlt2 {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/EMP?allowMultiQueries=true";
			Connection con = DriverManager.getConnection(url, "root", "root");

			Statement stmt = con.createStatement();
			stmt.executeUpdate("USE EMP");
			stmt.executeUpdate(
					"CREATE TABLE IF NOT EXISTS COMPANY1" +
					"(ID INT PRIMARY KEY NOT NULL," +
					"NAME VARCHAR(50) NOT NULL," +
					"AGE INT NOT NULL," +
					"ADDRESS VARCHAR(100)," +
					"SALARY REAL);" + 
					"CREATE TABLE IF NOT EXISTS COMPANY2" +
					"(ID INT PRIMARY KEY NOT NULL," +
					"NAME VARCHAR(50) NOT NULL," +
					"AGE INT NOT NULL," +
					"ADDRESS VARCHAR(100)," +
					"SALARY REAL);");
			
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}