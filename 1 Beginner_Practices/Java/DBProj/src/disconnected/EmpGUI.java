package disconnected;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpGUI extends JFrame {
	
	static Connection con = null;
	Statement stmt = null;

	private JPanel contentPane;
	private JTable table;

	public static EmpGUI current;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpGUI.current = new EmpGUI();
					EmpGUI.current.setVisible(true);
					EditForm.current = new EditForm();
					EditForm.current.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmpGUI() {

		table = new JTable();
		reload();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					if (stmt != null) {
						stmt.close();
					}
					if (con != null) {
						con.close();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		setResizable(false);
		setTitle("EmpGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 245);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("Edit");
		menuBar.add(mnFile);

		JMenuItem mntmInsert = new JMenuItem("Insert");
		mntmInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditForm.current.clear();
				EditForm.current.isUpdate = false;
				EditForm.current.setTitle("Inserer employe");
				EditForm.current.setVisible(true);
			}
		});
		mnFile.add(mntmInsert);

		JMenuItem mntmUpdate = new JMenuItem("Update");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "No line is selected");
				} else if (table.getSelectedRowCount() > 1) {
					JOptionPane.showMessageDialog(null, "Multiple lines are selected");
				} else {
					EditForm.current.editDataModel.setRow(getRow(table.getSelectedRows()[0]));
					EditForm.current.isUpdate = true;
					EditForm.current.setTitle("Modifier employe");
					EditForm.current.setVisible(true);
				}
			}
		});
		mnFile.add(mntmUpdate);

		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "No line is selected");
				} else {
					int n_lines_to_delete = table.getSelectedRows().length;
					int opt = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to delete " + n_lines_to_delete + " line(s)?", "Confirmation",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (opt == 0) {
						try {
							String ids = "";
							for (int i = 0; i < n_lines_to_delete; i++) {
								if (i == n_lines_to_delete - 1) {
									ids += table.getValueAt(table.getSelectedRows()[i], 0);
								} else {
									ids += table.getValueAt(table.getSelectedRows()[i], 0) + ",";
								}
							}
							EmpGUI.current.con.setAutoCommit(false);
							stmt.executeUpdate("DELETE FROM company WHERE id IN (" + ids + ")");
							EmpGUI.current.con.commit();
							EmpGUI.current.con.setAutoCommit(true);
							con.close();
							reload();

						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		mnFile.add(mntmDelete);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "Example - Database programming course (Prof. Ramiro)";
				JOptionPane.showMessageDialog(null, msg, "About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setBounds(0, 0, 428, 183);
		contentPane.add(scrollPane);

	}

	private Connection stablishConnection() throws SQLException {
		if (con == null || con.isClosed()) {
			String url = "jdbc:mysql://localhost:3306/EMP";
			con = DriverManager.getConnection(url, "root", "root");
		}
		return con;
	}

	void reload() {
		try {

			String sql = "SELECT * FROM COMPANY";
			ResultSet rs = null;
			try {
				stmt = stablishConnection().createStatement();
				rs = stmt.executeQuery(sql);

				table.setModel(buildTableModel(rs));

				rs.close();
			} finally {
				if (rs != null) {
					rs.close();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Object[] getRow(int row) {
		Object ligne[] = new Object[table.getColumnCount()];
		for (int i = 0; i < table.getColumnCount(); i++) {
			ligne[i] = table.getValueAt(row, i);
		}

		return ligne;
	}

	public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

		ResultSetMetaData metaData = rs.getMetaData();

		Vector<String> columnNames = new Vector<String>();
		int columnCount = metaData.getColumnCount();
		for (int column = 1; column <= columnCount; column++) {
			columnNames.add(metaData.getColumnName(column));
		}

		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		while (rs.next()) {
			Vector<Object> row = new Vector<Object>();
			for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				row.add(rs.getObject(columnIndex));
			}
			data.add(row);
		}

		return new DefaultTableModel(data, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {

				return false;
			}
		};
	}
}