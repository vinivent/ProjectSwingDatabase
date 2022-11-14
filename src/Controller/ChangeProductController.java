package Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import View.ChangeProduct;
import Model.DAO.ConnectionDAO;
import Model.Entity.Product;

public class ChangeProductController {

    Connection connection;
    PreparedStatement pstm;
    Product objProduct;

                                                                                                                                 
    public void changeProduct() {

        String sql = "UPDATE registerProduct set id=?,productAmount=?,productName=?,productCategory=?,purchaseValue=?,saleValue=?,productRegisterDate=?";
        connection = new ConnectionDAO().getConnection();
        if (searchId() == false) {
            JOptionPane.showMessageDialog(null, "Não é possível alterar: produto inexistente.");

            ChangeProduct.nameTextField.setText(null);
            ChangeProduct.codeTextField.setText(null);
            ChangeProduct.purchaseTextField.setText(null);
            ChangeProduct.saleTextField.setText(null);
            ChangeProduct.categoryTextField.setText(null);
            ChangeProduct.amountTextField.setText(null);
            ChangeProduct.dateChooser.setDate(null);

        } else {
            try {
                Date productDate = ConvertDate.convertUtilDateToSqlDate(ChangeProduct.dateChooser.getDate());

                pstm = connection.prepareStatement(sql);
                pstm.setString(1, ChangeProduct.codeTextField.getText());
                pstm.setString(2, ChangeProduct.amountTextField.getText());
                pstm.setString(3, ChangeProduct.nameTextField.getText());
                pstm.setString(4, ChangeProduct.categoryTextField.getText());
                pstm.setString(5, ChangeProduct.purchaseTextField.getText());
                pstm.setString(6, ChangeProduct.saleTextField.getText());
                pstm.setDate(7,  productDate);

                Integer added = pstm.executeUpdate();
                if (added > 0) {
                    JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.");
                }
                pstm.close();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "ChangeProductDAO:" + error);
            }
        }

    }

    public boolean searchId() {
        String sql = "SELECT ID FROM registerProduct WHERE ID= ?";
        try {
            connection = new ConnectionDAO().getConnection();
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, ChangeProduct.codeTextField.getText());
            ResultSet result = pstm.executeQuery();
            if (result.next() == false) {
                return false;
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "SearchProductDAO:" + error);
        }
        return true;
    }
}
