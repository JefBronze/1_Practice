package db1_MySql;

import java.sql.*;

public class DropTables {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/EMP?allowMultiQueries=true";
			Connection con = DriverManager.getConnection(url, "root", "root");

			Statement stmt = con.createStatement();
			stmt.executeUpdate("USE EMP");
			stmt.executeUpdate(
					"DROP TABLE COMPANY1");
			stmt.executeUpdate(
					"DROP TABLE COMPANY2");

			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}