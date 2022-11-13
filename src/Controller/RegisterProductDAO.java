package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Model.DAO.ConnectionDAO;
import Model.Entity.Product;

public class RegisterProductDAO {

    Connection connection;
    PreparedStatement pstm;

    public void registerProduct(Product objProduct) {
        String sql = "INSERT INTO registerProduct (id, productAmount, productName, productCategory, purchaseValue, saleValue, productRegisterDate) VALUES (?,?,?,?,?,?,?)";
        connection = new ConnectionDAO().getConnection();

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, objProduct.getProductId().toString());
            pstm.setString(2, objProduct.getProductQtd().toString());
            pstm.setString(3, objProduct.getProductName());
            pstm.setString(4, objProduct.getProductCategory());
            pstm.setString(5, objProduct.getProductPurchase().toString());
            pstm.setString(6, objProduct.getProductSale().toString());
            pstm.setDate(7, objProduct.getProductDate());

            Integer added = pstm.executeUpdate();
            if (added > 0) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
            }
            pstm.close();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "RegisterProductDAO: " + error);
        }
    }
}