package View;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogIn extends JFrame implements ActionListener  {

    private JPanel contentPane;
    private JTextField loginTextField;
    private JPasswordField passwordField;
    private JButton btnLogIn;

    public LogIn() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("./lib/fogo.png"));
        setForeground(new Color(0, 0, 0));
        setTitle("Sistema G3VD");
        setResizable(false);
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

        btnLogIn = new JButton("Entrar");
        btnLogIn.setBounds(195, 207, 69, 20);
        contentPane.add(btnLogIn);

        passwordField = new JPasswordField();
        passwordField.setBounds(164, 173, 134, 20);
        contentPane.add(passwordField);

       btnLogIn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (loginTextField.getText().equals("") || passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        } else if (loginTextField.getText().equals("admin") && passwordField.getText().equals("admin")) {
            dispose();
            Operations operationsFrame = new Operations();
            operationsFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Login ou senha inválidos");
            loginTextField.setText("");
            passwordField.setText("");
        }

    }
}
