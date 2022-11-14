package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import View.ManageProduct;
import Model.DAO.ConnectionDAO;

public class ShowTablesController {
    ResultSet result;
    Connection connection;
    PreparedStatement pstm;

    public void showTables() throws SQLException {
        String sql = "SELECT * FROM registerProduct";
        String sqlCount = "SELECT COUNT(*) FROM registerProduct";
        connection = new ConnectionDAO().getConnection();

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sqlCount);
        rs.next();
        int count = rs.getInt(1);

        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Não existem produtuos registrados em nosso sistema!");
        } else {
            try {
                pstm = connection.prepareStatement(sql);
                result = pstm.executeQuery();
                DefaultTableModel model = (DefaultTableModel) ManageProduct.table.getModel();

                while (result.next()) {
                    model.addRow(new String[] { result.getString(1), result.getString(2), result.getString(3),
                            result.getString(4), result.getString(5), result.getString(6), result.getString(7) });
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "ShowTablesDAO: " + error);
            }
        }
    }

}
