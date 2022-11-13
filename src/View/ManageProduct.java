package View;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.DeleteProductDAO;
import Controller.ShowTablesDAO;

public class ManageProduct extends JFrame implements ActionListener {

	private JPanel contentPane;
	public static JTextField textField;
	public static JTable table;
	private JButton buttonLeave, buttonDelete, buttonView;

	public ManageProduct() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./lib/fogo.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel internalTitle = new JLabel("G3VD ");
		internalTitle.setHorizontalAlignment(SwingConstants.CENTER);
		internalTitle.setFont(new Font("Modric", Font.PLAIN, 86));
		internalTitle.setBounds(277, 0, 169, 102);
		contentPane.add(internalTitle);

		JLabel internalSubtitle = new JLabel("Store");
		internalSubtitle.setFont(new Font("Modric", Font.PLAIN, 15));
		internalSubtitle.setBounds(382, 76, 84, 28);
		contentPane.add(internalSubtitle);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 431, 169, 20);
		contentPane.add(textField);

		JLabel lableCode = new JLabel("Código Produto:");
		lableCode.setFont(new Font("Montserrat", Font.PLAIN, 11));
		lableCode.setBounds(104, 434, 96, 14);
		contentPane.add(lableCode);

		buttonDelete = new JButton("Deletar");
		buttonDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonDelete.setForeground(Color.RED);
		buttonDelete.setBounds(400, 430, 89, 23);
		contentPane.add(buttonDelete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 113, 644, 301);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(

				null, new String[] {
						"ID", "Quantidade", "Nome", "Categoria", "Valor de Compra", "Valor de Venda", "Data de Registro"
				}));
		table.getColumnModel().getColumn(0).setPreferredWidth(72);
		table.getColumnModel().getColumn(2).setPreferredWidth(84);
		table.getColumnModel().getColumn(3).setPreferredWidth(91);
		table.getColumnModel().getColumn(4).setPreferredWidth(96);
		table.getColumnModel().getColumn(5).setPreferredWidth(88);
		table.getColumnModel().getColumn(6).setPreferredWidth(113);

		JLabel storageLabel = new JLabel("Estoque:");
		storageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		storageLabel.setFont(new Font("Montserrat", Font.BOLD, 11));
		storageLabel.setBounds(320, 113, 62, 14);
		contentPane.add(storageLabel);

		buttonLeave = new JButton("Sair");
		buttonLeave.setForeground(Color.RED);
		buttonLeave.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonLeave.setBounds(499, 430, 89, 23);
		contentPane.add(buttonLeave);

		buttonView = new JButton("Ver Estoque");
		buttonView.setForeground(Color.RED);
		buttonView.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonView.setBounds(535, 44, 99, 23);
		contentPane.add(buttonView);

		buttonDelete.addActionListener(this);
		buttonLeave.addActionListener(this);
		buttonView.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(buttonDelete)) {
			DeleteProductDAO productToBeDeleteed = new DeleteProductDAO();
			productToBeDeleteed.deleteProduct();
			((DefaultTableModel) table.getModel()).setRowCount(0);
		}
		if (event.getSource().equals(buttonView)) {
			((DefaultTableModel) table.getModel()).setRowCount(0);
			ShowTablesDAO objShow = new ShowTablesDAO();
			try {
				objShow.showTables();
			} catch (SQLException error) {
				JOptionPane.showMessageDialog(null, "ManageProduct:" + error);
			}
		}
		if (event.getSource().equals(buttonLeave)) {
			dispose();
			Operations opFrame = new Operations();
			opFrame.setVisible(true);
		}
	}
}
