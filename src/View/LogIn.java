package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;

public class LogIn extends JFrame {

    private JPanel contentPane;
    private JTextField loginTextField;
    private JPasswordField passwordField;

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

        JButton btnLogIn = new JButton("Entrar");
        btnLogIn.setBounds(195, 207, 69, 20);
        contentPane.add(btnLogIn);

        passwordField = new JPasswordField();
        passwordField.setBounds(164, 173, 134, 20);
        contentPane.add(passwordField);
    }
}
