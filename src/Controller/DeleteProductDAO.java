package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Model.DAO.ConnectionDAO;
import View.ManageProduct;

public class DeleteProductDAO {
    Connection connection;
    PreparedStatement pstm;

    public void deleteProduct() {
        connection = new ConnectionDAO().getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar esse produto?", "Atenção",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM registerProduct WHERE ID= ?";
            try {
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
