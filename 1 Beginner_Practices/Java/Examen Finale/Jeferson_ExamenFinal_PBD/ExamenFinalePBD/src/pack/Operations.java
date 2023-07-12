package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class Operations {

	/* Ajoutez un nouveau cours au tableau des cours */
	public static void addEtudiant(String eId, String eFirstName, String eLastName) {
		String insertEtudiantSQL = "INSERT INTO Etudiant (E_Id, E_PNom, E_Name) VALUES (?, ?, ?)";

		try {
			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pstmt = con.prepareStatement(insertEtudiantSQL);

			pstmt.setString(1, eId);
			pstmt.setString(2, eFirstName);
			pstmt.setString(3, eLastName);
			pstmt.executeUpdate();

			System.out.println("L'élève a ajouté avec succès");
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* Add a new course to the Courses table */
	public static void addCours(String cId, String cName, int cDuration) {
		String insertCoursSQL = "INSERT INTO Cours (C_Id, C_Name, C_Duree) VALUES (?, ?, ?)";

		try {

			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pstmt = con.prepareStatement(insertCoursSQL);

			pstmt.setString(1, cId);
			pstmt.setString(2, cName);
			pstmt.setInt(3, cDuration);
			pstmt.executeUpdate();

			System.out.println("Course added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* Supprimer un étudiant d'un cours */
	public static void enrollEtudiant(String eId, String cId) {
		String enrollEtudiantSQL = "INSERT INTO Inscriptions (E_Id, C_Id) VALUES (?, ?)";

		try {

			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pstmt = con.prepareStatement(enrollEtudiantSQL);

			pstmt.setString(1, eId);
			pstmt.setString(2, cId);
			pstmt.executeUpdate();

			System.out.println("L'étudiant s'est inscrit avec succès");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* Supprimer un étudiant d'un cours */
	public static void removeEtudiantFromCours(String eId, String cId) {
		String removeEtudiantSQL = "DELETE FROM Inscriptions WHERE E_Id = ? AND C_Id = ?";

		try {

			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pstmt = con.prepareStatement(removeEtudiantSQL);

			pstmt.setString(1, eId);
			pstmt.setString(2, cId);
			pstmt.executeUpdate();

			System.out.println("Étudiant supprimé du cours avec succès");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* Supprimer un cours */
	public static void deleteCours(String cId) {
		String deleteCoursSQL = "DELETE FROM Cours WHERE C_Id = ?";

		try {

			String url = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pstmt = con.prepareStatement(deleteCoursSQL);

			pstmt.setString(1, cId);
			pstmt.executeUpdate();

			System.out.println("Course deleted successfully");
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Impossible de supprimer le cours car des étudiants y sont inscrits.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
