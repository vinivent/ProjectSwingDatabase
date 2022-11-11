package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.DAO.ConnectionDAO;
import Model.Entity.Product;

public class RegisterController {
    Product product = new Product(null, null, null, null, null, null, null);

    public int add(Product product) throws SQLException {
        ConnectionDAO conection = new ConnectionDAO();
        int registers; // retorna se o registro foi feito corretamente
        try (PreparedStatement pstmt = conection.getConnection().prepareStatement(
                "INSERT INTO register(productId,productName,productCategory,productPurchase,productSale,productQtd,productDate)"
                        +
                        " VALUES (?,?,?,?,?,?,?)")) { // o statement faz com que as info sejam inseridas no BD uma após
                                                      // da outra/pega as info e joga no objeto preparestatement através
                                                      // do obj product {
            pstmt.setInt(1, product.getProductId());
            pstmt.setString(2, product.getProductName());
            pstmt.setString(3, product.getProductCategory());
            pstmt.setDouble(4, product.getProductPurchase());
            pstmt.setDouble(5, product.getProductSale());
            pstmt.setInt(6, product.getProductQtd());
            pstmt.setDate(7, product.getProductDate());

            registers = pstmt.executeUpdate(); // exec a inclusão no BD
        }

        PreparedStatement pstmtAux = conection.getConnection().prepareStatement("SELECT @@IDENTITY"); // pega o último
                                                                                                      // número
                                                                                                      // acrescentado e
                                                                                                      // joga na tela
        ResultSet rs = pstmtAux.executeQuery();
        int code = 0;

        if ((registers == 1) && (rs != null)) {
            rs.next(); // parte para a próxima inclusão e assim por diante
            code = rs.getInt(1); // RECEBE O CÓDIGO
            return code;
        } else {
            return code;
        }

    }
}
