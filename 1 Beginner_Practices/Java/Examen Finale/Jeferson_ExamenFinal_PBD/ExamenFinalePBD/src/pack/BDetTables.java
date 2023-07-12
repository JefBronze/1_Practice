package pack;

import java.sql.*;

public class BDetTables {

	public static void main(String[] args) {

		/* Création de base de données */
		try {
			String url = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");

			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS EtudCours2023");

			stmt.close();
			con.close();

			System.out.println("Première Étape: Base de données créée avec succès");

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * Appelez la méthode des créations pour créer des tables dans la base de
		 * données
		 */
		createTables();
	}

	/* Créez les tables dans la base de données */
	public static void createTables() {
		try {
			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();

			/* Créer la table des élèves */
			String createEtudiantTable = "CREATE TABLE IF NOT EXISTS Etudiant (" + "E_Id VARCHAR(10) PRIMARY KEY,"
					+ "E_PNom VARCHAR(50) NOT NULL," + "E_Name VARCHAR(50) NOT NULL)";
			stmt.execute(createEtudiantTable);

			// Créer le tableau des cours
			String createCoursTable = "CREATE TABLE IF NOT EXISTS Cours (" + "C_Id VARCHAR(10) PRIMARY KEY,"
					+ "C_Name VARCHAR(50) NOT NULL," + "C_Duree INT NOT NULL)";
			stmt.execute(createCoursTable);

			// Créer le tableau des inscriptions
			String createInscriptionsTable = "CREATE TABLE IF NOT EXISTS Inscriptions (" + "E_Id VARCHAR(10),"
					+ "C_Id VARCHAR(10)," + "PRIMARY KEY (E_Id, C_Id),"
					+ "FOREIGN KEY (E_Id) REFERENCES Etudiant(E_Id) ON DELETE CASCADE,"
					+ "FOREIGN KEY (C_Id) REFERENCES Cours(C_Id) ON DELETE RESTRICT)";
			stmt.execute(createInscriptionsTable);

			System.out.println("Deuxième étape: Tableaux créés avec succès");
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
