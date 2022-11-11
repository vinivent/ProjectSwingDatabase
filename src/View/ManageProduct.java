package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ManageProduct extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JButton buttonLeave, buttonDelete;

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

		table = new JTable();
		table.setBounds(104, 132, 489, 287);
		contentPane.add(table);

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

		buttonDelete.addActionListener(this);
		buttonLeave.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(buttonDelete)) {
			System.out.println("deveria deletar as porra la");
		}
		if (event.getSource().equals(buttonLeave)) {
			dispose();
			Operations opFrame = new Operations();
			opFrame.setVisible(true);
		}

	}
}
