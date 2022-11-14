package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Model.DAO.ConnectionDAO;
import View.ManageProduct;

public class DeleteProductController {
     Connection connection;
     PreparedStatement pstm;

    public void deleteProduct() {
        String sql = "DELETE FROM registerProduct WHERE ID= ?";

        if (searchId() == false) {
            JOptionPane.showMessageDialog(null, "Código do produto não encontrado no nosso sistema.");
            ManageProduct.textField.setText(null);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar esse produto?", "Atenção",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    connection = new ConnectionDAO().getConnection();
                    pstm = connection.prepareStatement(sql);
                    pstm.setString(1, ManageProduct.textField.getText());
                    int deleted = pstm.executeUpdate();
                    if (deleted > 0) {
                        JOptionPane.showMessageDialog(null, "Produto deletado do nosso sistema, com sucesso!");
                        ManageProduct.textField.setText(null);
                    }
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "DeleteProductDAO:" + error);
                }
            }
        }

    }

    public boolean searchId() {
        String sql = "SELECT ID FROM registerProduct WHERE ID= ?";
        try {
            connection = new ConnectionDAO().getConnection();
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, ManageProduct.textField.getText());
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
