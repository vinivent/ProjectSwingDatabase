package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;

import Controller.ChangeProductController;

public class ChangeProduct extends JFrame implements ActionListener {

    private JPanel contentPane;
    public static JTextField codeTextField;
    public static JTextField nameTextField;
    public static JTextField purchaseTextField;
    public static JTextField saleTextField;
    public static JTextField categoryTextField;
    public static JTextField amountTextField;
    public static JDateChooser dateChooser;
    private JButton buttonLeave, buttonClear, buttonChange;

    public ChangeProduct() {
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage("./lib/fogo.png"));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(620, 320, 636, 400);
        Toolkit toolkit = getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setLocation(dimension.width/2 - getWidth()/2, dimension.height/2 - getHeight()/2);
       
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
        lableDate.setBounds(442, 192, 124, 14);
        contentPane.add(lableDate);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(442, 208, 136, 20);
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

        buttonChange = new JButton("Alterar");
        buttonChange.setBounds(135, 281, 89, 23);
        contentPane.add(buttonChange);

        buttonClear = new JButton("Limpar");
        buttonClear.setBounds(261, 281, 89, 23);
        contentPane.add(buttonClear);

        buttonLeave = new JButton("Sair");
        buttonLeave.setBounds(389, 281, 89, 23);
        contentPane.add(buttonLeave);

        amountTextField = new JTextField();
        amountTextField.setColumns(10);
        amountTextField.setBounds(316, 208, 105, 20);
        contentPane.add(amountTextField);

        JLabel lableWarning = new JLabel("ATENÇÃO: DIGITE NOS CAMPOS QUE DESEJA ALTERAR");
        lableWarning.setForeground(Color.RED);
        lableWarning.setFont(new Font("Montserrat", Font.BOLD, 11));
        lableWarning.setBounds(141, 113, 326, 14);
        contentPane.add(lableWarning);

        buttonChange.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonLeave.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(buttonChange)) {
            ChangeProductController changeProduct = new ChangeProductController();

            changeProduct.changeProduct();

            nameTextField.setText(null);
            codeTextField.setText(null);
            purchaseTextField.setText(null);
            saleTextField.setText(null);
            categoryTextField.setText(null);
            amountTextField.setText(null);
            dateChooser.setDate(null);
        }
        if (event.getSource().equals(buttonClear)) {
            nameTextField.setText(null);
            codeTextField.setText(null);
            purchaseTextField.setText(null);
            saleTextField.setText(null);
            categoryTextField.setText(null);
            amountTextField.setText(null);
            dateChooser.setDate(null);
        }
        if (event.getSource().equals(buttonLeave)) {
            dispose();
            Operations opFrame = new Operations();
            opFrame.setVisible(true);
        }

    }
}