package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

}
