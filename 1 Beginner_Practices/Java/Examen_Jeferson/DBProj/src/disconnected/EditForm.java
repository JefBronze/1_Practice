package disconnected;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class EditForm extends JDialog {

	private final JPanel contentPane;
	private JTable table;

	boolean isUpdate = true;

	public static EditForm current;

	class MyEditTableModel extends DefaultTableModel {
		private String columnNames[] = { "ID", "NAME", "AGE", "ADDRESS", "SALARY" };

		public MyEditTableModel() {
			super();
			this.setColumnIdentifiers(columnNames);
			this.setRowCount(1);
		}

		public void setRow(Object lineMain[]) {
			this.setRowCount(0);
			this.addRow(lineMain);
		}

		public Object[] getRow() {
			Object line[] = new Object[columnNames.length];
			line[0] = this.getValueAt(0, 0);
			line[1] = this.getValueAt(0, 1);
			line[2] = this.getValueAt(0, 2);
			line[3] = this.getValueAt(0, 3);
			line[4] = this.getValueAt(0, 4);
			return line;
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			if (isUpdate && column == 0) {
				return false;
			} else
				return true;
		}
	}

	MyEditTableModel editDataModel = new MyEditTableModel();

	public void clear() {
		editDataModel.setRowCount(0);
		editDataModel.setRowCount(1);
	}

	public EditForm() {
		setResizable(false);
		setBounds(100, 100, 730, 183);

		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable(editDataModel);
		table.setRowHeight(30);
		table.putClientProperty("terminateEditOnFocusLost", true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 717, 53);
		contentPane.add(scrollPane);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isUpdate) {
					if (myValidate()) {
						try {
							String query = "UPDATE company SET name=?, age=?, address=?, salary=? WHERE id=?";
							PreparedStatement preparedStatement = EmpGUI.current.con.prepareStatement(query);
							preparedStatement.setObject(1, table.getValueAt(0, 1));
							preparedStatement.setObject(2, table.getValueAt(0, 2));
							preparedStatement.setObject(3, table.getValueAt(0, 3));
							preparedStatement.setObject(4, table.getValueAt(0, 4));
							preparedStatement.setObject(5, table.getValueAt(0, 0));
							preparedStatement.executeUpdate();
							EmpGUI.current.reload();
							EmpGUI.current.con.close();
							JOptionPane.showMessageDialog(null, "Base de données modifiée");
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(null, "Base de données pas modifiée");
							e1.printStackTrace();
						}
						EditForm.current.dispose();
					}
				} else {
					if (myValidate()) {
						try {
							PreparedStatement stmt = EmpGUI.current.con.prepareStatement(
									"INSERT INTO company (id,name,age,address,salary) VALUES (?,?,?,?,?)");
							stmt.setObject(1, table.getValueAt(0, 0));
							stmt.setObject(2, table.getValueAt(0, 1));
							stmt.setObject(3, table.getValueAt(0, 2));
							stmt.setObject(4, table.getValueAt(0, 3));
							stmt.setObject(5, table.getValueAt(0, 4));
							stmt.executeUpdate();
							EmpGUI.current.con.close();
							EmpGUI.current.reload();

							JOptionPane.showMessageDialog(null, "Données insérées dans la base de données");
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(null, "Exception: Données pas insérées");

						}
						EditForm.current.dispose();
					}
				}
			}
		});
		btnOk.setBounds(476, 100, 89, 23);
		contentPane.add(btnOk);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditForm.current.dispose();
			}
		});
		btnCancel.setBounds(594, 100, 89, 23);
		contentPane.add(btnCancel);
	}

	private boolean myValidate() {

		if (!isUpdate) {

			if (!isNonNegInteger(table.getValueAt(0, 0))) {
				JOptionPane.showMessageDialog(null, "Id invalide");
				return false;
			}

			try {
				ResultSet rs = EmpGUI.current.stmt
						.executeQuery("SELECT * FROM company WHERE id =  " + table.getValueAt(0, 0));
				if (rs.first()) {
					JOptionPane.showMessageDialog(null, "Id répété: id existe déjà dans la base de données");
					return false;
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Base de données inaccessible");
				return false;
			}
		}

		if (!isNonNegInteger(table.getValueAt(0, 2))) {
			JOptionPane.showMessageDialog(null, "Âge invalide: l'âge doit être un entier non-negatif");
			return false;
		}

		if (!isNonNegDouble(table.getValueAt(0, 4))) {
			JOptionPane.showMessageDialog(null, "Salaire invalide: salaire doit être un double non-negatif");
			return false;
		}

		if (!isFirstLetterUppercase(table.getValueAt(0, 1))) {
			JOptionPane.showMessageDialog(null, "Nom invalide");
			return false;
		}
		if (!isNotFirstLetterLowercase(table.getValueAt(0, 1))) {
			JOptionPane.showMessageDialog(null, "Nom invalide");
			return false;
		}

		if (isEmptyString(table.getValueAt(0, 1))) {
			JOptionPane.showMessageDialog(null, "Nom invalide");
			return false;
		}
		if (!nameCorrect(table.getValueAt(0, 1))) {
			JOptionPane.showMessageDialog(null, "Nom invalide");
			return false;
		}

		return true;
	}

	static boolean isNonNegInteger(Object s) {
		if (s == null) {
			return false;
		}
		try {
			int r = Integer.parseInt("" + s);
			if (r >= 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	static boolean isNonNegDouble(Object s) {
		if (s == null) {
			return false;
		}
		try {
			double r = Double.parseDouble("" + s);
			if (r >= 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	static boolean isEmptyString(Object s) {
		if (s == null) {
			return true;
		}
		try {
			if (s.toString().isEmpty())
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	static boolean isFirstLetterUppercase(Object s) {
		try {
			if (Character.isUpperCase(s.toString().charAt(0))) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	static boolean isNotFirstLetterLowercase(Object s) {
		try {
			String str = s.toString();
			for (int i = 1; i < str.length(); i++) {
				if (Character.isLowerCase(str.charAt(i))) {
					return true;
				}

			}
			return false;

		} catch (Exception e) {
			return false;
		}
	}

	public static boolean nameCorrect(Object s) {
		String name = "" + s;
		return name.matches("[a-zA-Z]+");
	}

}
