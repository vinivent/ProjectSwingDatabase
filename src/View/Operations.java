package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

import javax.swing.JButton;

public class Operations extends JFrame {

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

        JButton btnRegister = new JButton("Cadastrar Produto");
        btnRegister.setBounds(51, 171, 136, 23);
        getContentPane().add(btnRegister);

        JButton btnChange = new JButton("Alterar Produto");
        btnChange.setBounds(246, 201, 136, 23);
        getContentPane().add(btnChange);

        JButton btnShow = new JButton("Exibir Produtos");
        btnShow.setBounds(246, 171, 136, 23);
        getContentPane().add(btnShow);

        JButton btnDelete = new JButton("Deletar Produto");
        btnDelete.setBounds(51, 201, 136, 23);
        getContentPane().add(btnDelete);

        JLabel internalLable = new JLabel("Escolha uma opção:");
        internalLable.setFont(new Font("Montserrat", Font.BOLD, 11));
        internalLable.setBounds(162, 139, 136, 14);
        getContentPane().add(internalLable);

    }
}
