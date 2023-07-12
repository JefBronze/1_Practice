package pack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main {

	/* Ajouter des échantillons d'étudiants et de cours */

	/*
	 * Operations.addEtudiant("E1234567", "Jeferson", "Bronze");
	 * Operations.addEtudiant("E1234568", "Nathalia", "Dias");
	 * 
	 * Operations.addCours("C12345", "Mathmatiques", 6);
	 * Operations.addCours("C12346", "Physique", 5); Operations.addCours("C12347",
	 * "Portugais", 5); Operations.addCours("C12348", "Francais", 5);
	 * 
	 * Operations.enrollEtudiant("E1234567", "C12345");
	 * Operations.enrollEtudiant("E1234568", "C12346");
	 */

	/* Operations.addCours("C12349", "Art", 5); */

	/*
	 * Operations.removeEtudiantFromCours("E1234567", "C12345");
	 * 
	 * Operations.deleteCours("C12345");
	 */

	private static final String DB_URL = "jdbc:mysql://localhost:3306/EtudCours2023?serverTimezone=UTC";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";

	private JTable table;
	private DefaultTableModel tableModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JFrame frame;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JButton addButton;
	private JButton deleteButton;
	private JButton updateButton;

	public Main() {
		initialize();
		loadTable();
		showEtudiantTable();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setLayout(new FlowLayout(FlowLayout.RIGHT));
		menuBar.add(mnFile);

		addButton = new JButton("Add");
		addButton.setPreferredSize(new Dimension(80, 30));
		mnFile.add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRecord();
			}
		});

		deleteButton = new JButton("Delete");
		deleteButton.setPreferredSize(new Dimension(80, 30));
		mnFile.add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteRecord();
			}
		});

		updateButton = new JButton("Update");
		updateButton.setPreferredSize(new Dimension(80, 30));
		mnFile.add(updateButton);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateRecord();
			}
		});

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuBar.setBorderPainted(false); // Remove the border

		tableModel = new DefaultTableModel();
		tableModel.addColumn("ID");
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Course ID");
		tableModel.addColumn("Course Name");
		tableModel.addColumn("Course Duration");

		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		panel.add(scrollPane, BorderLayout.CENTER); // Only add the scrollPane containing the table once
	}

	private void loadTable() {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement(
						"SELECT e.E_Id, e.E_PNom, e.E_Name, c.C_Id, c.C_Name, c.C_Duree FROM Etudiant e, Cours c, Inscriptions i WHERE e.E_Id = i.E_Id AND c.C_Id = i.C_Id");
				ResultSet rs = stmt.executeQuery()) {

			// Clear existing data from the table model
			tableModel.setRowCount(0);

			while (rs.next()) {
				Object[] row = { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6) };
				tableModel.addRow(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void showEtudiantTable() {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Etudiant")) {
			ResultSet rs = stmt.executeQuery();
			loadTable();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void showCoursTable() {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Cours")) {
			ResultSet rs = stmt.executeQuery();
			loadTable();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void showInscriptionsTable() {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Inscriptions")) {
			ResultSet rs = stmt.executeQuery();
			loadTable();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void addRecord() {
		// Create a dialog for the user to input the student information
		JTextField idField = new JTextField();
		idField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				// Check if the student ID is unique
				try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
						PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Etudiant WHERE E_Id = ?")) {
					stmt.setString(1, idField.getText());
					ResultSet rs = stmt.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Student ID must be unique");
						idField.requestFocus();
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		JTextField firstNameField = new JTextField();
		JTextField lastNameField = new JTextField();

		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.add(new JLabel("Student ID:"));
		panel.add(idField);
		panel.add(new JLabel("First Name:"));
		panel.add(firstNameField);
		panel.add(new JLabel("Last Name:"));
		panel.add(lastNameField);

		int result = JOptionPane.showConfirmDialog(null, panel, "Add Student", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {
			String id = idField.getText();
			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();

			// Add the student to the database
			try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					PreparedStatement stmt = conn
							.prepareStatement("INSERT INTO Etudiant (E_Id, E_PNom, E_Name) VALUES (?, ?, ?)")) {
				stmt.setString(1, id);
				stmt.setString(2, firstName);
				stmt.setString(3, lastName);
				int rowsInserted = stmt.executeUpdate();
				if (rowsInserted > 0) {
					JOptionPane.showMessageDialog(null, "Student added successfully");
					loadTable();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void deleteRecord() {
		// Get the selected row in the table
		int selectedRow = table.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(null, "Please select a row to delete");
			return;
		}

		// Get the student ID from the selected row
		String id = (String) tableModel.getValueAt(selectedRow, 0);

		// Check if the student is enrolled in any courses
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Inscriptions WHERE E_Id = ?")) {
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Cannot delete a student enrolled in a course");
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Delete the student from the database
		int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?",
				"Delete Student", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if (result == JOptionPane.YES_OPTION) {
			try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					PreparedStatement stmt = conn.prepareStatement("DELETE FROM Etudiant WHERE E_Id = ?")) {
				stmt.setString(1, id);
				int rowsDeleted = stmt.executeUpdate();
				if (rowsDeleted > 0) {
					JOptionPane.showMessageDialog(null, "Student deleted successfully");
					loadTable();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void updateRecord() {
		// Get the selected row in the table
		int selectedRow = table.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(null, "Please select a row to update");
			return;
		}

		// Get the student ID from the selected row
		String id = (String) tableModel.getValueAt(selectedRow, 0);

		// Get the current values of the student's first name and last name
		String firstName = (String) tableModel.getValueAt(selectedRow, 1);
		String lastName = (String) tableModel.getValueAt(selectedRow, 2);

		// Create a dialog for the user to input the updated student information
		JTextField idField = new JTextField(id);
		idField.setEditable(false);
		JTextField firstNameField = new JTextField(firstName);
		JTextField lastNameField = new JTextField(lastName);

		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.add(new JLabel("Student ID:"));
		panel.add(idField);
		panel.add(new JLabel("First Name:"));
		panel.add(firstNameField);
		panel.add(new JLabel("Last Name:"));
		panel.add(lastNameField);

		int result = JOptionPane.showConfirmDialog(null, panel, "Update Student", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {
			String newFirstName = firstNameField.getText();
			String newLastName = lastNameField.getText();

			// Check if the new first name and last name are different from the current
			// values
			if (newFirstName.equals(firstName) && newLastName.equals(lastName)) {
				JOptionPane.showMessageDialog(null, "No changes made to the student record");
				return;
			}

			// Update the student record in the database
			try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					PreparedStatement stmt = conn
							.prepareStatement("UPDATE Etudiant SET E_PNom = ?, E_Name = ? WHERE E_Id = ?")) {
				stmt.setString(1, newFirstName);
				stmt.setString(2, newLastName);
				stmt.setString(3, id);
				int rowsUpdated = stmt.executeUpdate();
				if (rowsUpdated > 0) {
					JOptionPane.showMessageDialog(null, "Student updated successfully");
					loadTable();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}