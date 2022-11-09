package Model.DAO;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;


public abstract class GenericDAO<T> {
    // private Connection connection;
    // private ConnectionDAO connectionDAO;

    // protected GenericDAO() {
	// 	connectionDAO = new ConnectionDAO();
	// 	this.connection = connectionDAO.getConnection();
	// }

    // protected Connection getConnection() {

	// 	if (connection == null) {
	// 		connectionDAO = new ConnectionDAO();
	// 		this.connection = connectionDAO.getConnection();
	// 	}
	// 	return connection;
	// }

    // public boolean save(String insertSql, Object... parametros) {
	// 	boolean resultado = true;
	// 	try {
	// 		PreparedStatement pstmt = connection.prepareStatement(insertSql);
	// 		for (int i = 0; i < parametros.length; i++) {
	// 			pstmt.setObject(i + 1, parametros[i]);
	// 		}
	// 		pstmt.execute();
	// 		pstmt.close();
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 		resultado = false;
	// 	} finally {
	// 		close();
	// 		return resultado;
	// 	}
	// }

    // protected void close() {
	// 	try {
	// 		if (connection != null) {
	// 			connection.close();
	// 			connection = null;
	// 		}
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 	}

	// }
}
