package View;


import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class RegisterProduct extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField codeTextField;
    private JTextField nameTextField;
    private JTextField purchaseTextField;
    private JTextField saleTextField;
    private JTextField categoryTextField;
    private JTextField textField_2;

    public RegisterProduct() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("./lib/fogo.png"));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 636, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel internalTitle = new JLabel("G3VD ");
        internalTitle.setHorizontalAlignment(SwingConstants.CENTER);
        internalTitle.setFont(new Font("Modric", Font.PLAIN, 86));
        internalTitle.setBounds(225, 0, 169, 102);
        contentPane.add(internalTitle);

        JLabel internalSubtitle = new JLabel("Store");
        internalSubtitle.setFont(new Font("Modric", Font.PLAIN, 15));
        internalSubtitle.setBounds(330, 76, 84, 28);
        contentPane.add(internalSubtitle);

        JLabel lableCode = new JLabel("Código Produto:");
        lableCode.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableCode.setBounds(27, 144, 124, 14);
        contentPane.add(lableCode);

        codeTextField = new JTextField();
        codeTextField.setBounds(27, 161, 105, 20);
        contentPane.add(codeTextField);
        codeTextField.setColumns(10);

        JLabel lableName = new JLabel("Nome do Produto:");
        lableName.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableName.setBounds(153, 144, 124, 14);
        contentPane.add(lableName);

        nameTextField = new JTextField();
        nameTextField.setColumns(10);
        nameTextField.setBounds(153, 161, 314, 20);
        contentPane.add(nameTextField);

        JLabel lableDate = new JLabel("Data de Registro:");
        lableDate.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableDate.setBounds(443, 192, 124, 14);
        contentPane.add(lableDate);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(442, 208, 140, 20);
        contentPane.add(dateChooser);

        JLabel lablePurchase = new JLabel("Valor de Compra:");
        lablePurchase.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lablePurchase.setBounds(64, 192, 124, 14);
        contentPane.add(lablePurchase);

        JLabel lableSale = new JLabel("Valor de Venda:");
        lableSale.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableSale.setBounds(190, 192, 124, 14);
        contentPane.add(lableSale);

        purchaseTextField = new JTextField();
        purchaseTextField.setColumns(10);
        purchaseTextField.setBounds(64, 208, 105, 20);
        contentPane.add(purchaseTextField);

        saleTextField = new JTextField();
        saleTextField.setColumns(10);
        saleTextField.setBounds(190, 208, 105, 20);
        contentPane.add(saleTextField);

        categoryTextField = new JTextField();
        categoryTextField.setColumns(10);
        categoryTextField.setBounds(486, 160, 105, 20);
        contentPane.add(categoryTextField);

        JLabel lableCategory = new JLabel("Categoria:");
        lableCategory.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableCategory.setBounds(486, 144, 124, 14);
        contentPane.add(lableCategory);

        JLabel lableAmount = new JLabel("Quantidade:");
        lableAmount.setFont(new Font("Montserrat", Font.PLAIN, 11));
        lableAmount.setBounds(316, 192, 124, 14);
        contentPane.add(lableAmount);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(316, 208, 105, 20);
        contentPane.add(textField_2);

        JButton buttonSave = new JButton("Salvar");
        buttonSave.setBounds(135, 281, 89, 23);
        contentPane.add(buttonSave);

        JButton buttonClear = new JButton("Limpar");
        buttonClear.setBounds(261, 281, 89, 23);
        contentPane.add(buttonClear);

        JButton buttonLeave = new JButton("Sair");
        buttonLeave.setBounds(389, 281, 89, 23);
        contentPane.add(buttonLeave);

        buttonSave.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        

    }
}
