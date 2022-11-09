package View;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Model.*;
import Model.DAO.AccountDAO;
import Model.Entity.Account;
import View.*;
import Controller.*;

public class LogIn extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField loginTextField;
    private JPasswordField passwordField;
    private JButton btnLogIn;
    private ILogInController<Account> controller;

    public LogIn() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("./lib/fogo.png"));
        setForeground(new Color(0, 0, 0));
        setTitle("Sistema G3VD");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel login = new JLabel("Login:");
        login.setBounds(118, 151, 46, 20);
        contentPane.add(login);

        JLabel password = new JLabel("Senha:");
        password.setBounds(118, 176, 46, 14);
        contentPane.add(password);

        JLabel title = new JLabel("G3VD ");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Modric", Font.PLAIN, 86));
        title.setBounds(141, 0, 169, 102);
        contentPane.add(title);

        JLabel subtitle = new JLabel("Store");
        subtitle.setFont(new Font("Modric", Font.PLAIN, 15));
        subtitle.setBounds(246, 76, 84, 28);
        contentPane.add(subtitle);

        loginTextField = new JTextField();
        loginTextField.setBounds(164, 151, 134, 20);
        contentPane.add(loginTextField);
        loginTextField.setColumns(10);

        JButton btnLogIn = new JButton("Entrar");
        btnLogIn.setBounds(195, 207, 69, 20);
        contentPane.add(btnLogIn);

        passwordField = new JPasswordField();
        passwordField.setBounds(164, 173, 134, 20);
        contentPane.add(passwordField);

        btnLogIn.addActionListener(this);

    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    public JTextField getLoginTextField() {
        return loginTextField;
    }

    public void setLoginTextField(JTextField loginTextField) {
        this.loginTextField = loginTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getBtnLogIn() {
        return btnLogIn;
    }

    public void setBtnLogIn(JButton btnLogIn) {
        this.btnLogIn = btnLogIn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnLogIn)
            logIn();

    }

    private void logIn() {
        String username = this.getLoginTextField().getText();
        String password = String.valueOf(getPasswordField().getPassword());

        Account account = new Account(username, password);

        if (controller.logIn(username, password)) {
            JOptionPane.showMessageDialog(this, "Conta alterada com sucesso");
        } else {
            JOptionPane.showMessageDialog(this, "Conta não localizada");

        }
    }
}
