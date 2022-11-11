package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Operations extends JFrame implements ActionListener {
	private JButton btnRegister, btnShow, btnChange;

	public Operations() {

		setTitle("Sistema G3VD ");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./lib/fogo.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		JLabel internalTitle = new JLabel("G3VD ");
		internalTitle.setHorizontalAlignment(SwingConstants.CENTER);
		internalTitle.setFont(new Font("Modric", Font.PLAIN, 86));
		internalTitle.setBounds(141, 0, 169, 102);
		getContentPane().add(internalTitle);

		JLabel internalSubtitle = new JLabel("Store");
		internalSubtitle.setFont(new Font("Modric", Font.PLAIN, 15));
		internalSubtitle.setBounds(246, 76, 84, 28);
		getContentPane().add(internalSubtitle);

		btnRegister = new JButton("Cadastrar Produto");
		btnRegister.setBounds(51, 171, 136, 23);
		getContentPane().add(btnRegister);

		btnChange = new JButton("Alterar Produto");
		btnChange.setBounds(147, 204, 136, 23);
		getContentPane().add(btnChange);

		btnShow = new JButton("Gerenciar Produtos");
		btnShow.setBounds(246, 171, 136, 23);
		getContentPane().add(btnShow);

		JLabel internalLable = new JLabel("Escolha uma opção:");
		internalLable.setFont(new Font("Montserrat", Font.BOLD, 11));
		internalLable.setBounds(162, 139, 136, 14);
		getContentPane().add(internalLable);

		btnRegister.addActionListener(this);
		btnShow.addActionListener(this);
		btnChange.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(btnRegister)) {
			dispose();
			RegisterProduct registerFrame = new RegisterProduct();
			registerFrame.setVisible(true);
		}
		if (event.getSource().equals(btnShow)) {
			dispose();
			ManageProduct manageFrame = new ManageProduct();
			manageFrame.setVisible(true);
		}
		if (event.getSource().equals(btnChange)) {
			dispose();
			ChangeProduct changeFrame = new ChangeProduct();
			changeFrame.setVisible(true);
		}

	}

}
