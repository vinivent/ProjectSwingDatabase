package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {

    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/ProjectNASSAU";
    private static final String DRIVER_MYSQL = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "mysql@123";

    private Connection connection;

    public ConnectionDAO() {
        loadDriver();
    }

    public Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            connection = DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void loadDriver() {
        System.out.println("Carregando o driver do banco de Dados");
        try {
            Class.forName(DRIVER_MYSQL);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}