package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Toolkit;

public class ManageProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

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
		textField.setBounds(425, 428, 169, 20);
		contentPane.add(textField);
		
		JLabel lableCode = new JLabel("Código Produto:");
		lableCode.setFont(new Font("Montserrat", Font.PLAIN, 11));
		lableCode.setBounds(319, 431, 96, 14);
		contentPane.add(lableCode);
		
		JButton btnNewButton = new JButton("Deletar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(615, 427, 89, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(104, 132, 489, 287);
		contentPane.add(table);
		
		JLabel storageLabel = new JLabel("Estoque:");
		storageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		storageLabel.setFont(new Font("Montserrat", Font.BOLD, 11));
		storageLabel.setBounds(320, 113, 62, 14);
		contentPane.add(storageLabel);
	}
}
