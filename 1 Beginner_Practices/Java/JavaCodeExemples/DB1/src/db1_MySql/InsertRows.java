package db1_MySql;

import java.sql.*;

public class InsertRows {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/EMP?allowMultiQueries=true";
			Connection con = DriverManager.getConnection(url, "root", "root");

			Statement stmt = con.createStatement();
			stmt.executeUpdate("USE EMP");
			stmt.executeUpdate(
					"INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)" + "VALUES (1,'Allen',25,'TEXAS',15000.00)");

			stmt.executeUpdate(
					"INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)" + "VALUES (2,'Paul',32,'California',20000.00)");

			stmt.executeUpdate(
					"INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)" + "VALUES (3,'Teddy',23,'Norway',20000.00)");

			stmt.executeUpdate("INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)"
					+ "VALUES (4,'Mark',25,'Richmond',65000.00)," + "(5,'John',28,'France',80000.00)");

			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}