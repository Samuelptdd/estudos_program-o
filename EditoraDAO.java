package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConnectionFactory;
import Model.Editora;

public class EditoraDAO {

	private ConnectionFactory connection;
	
	public EditoraDAO() {
		this.connection = new ConnectionFactory();
	}
	
	
	public void salvarEditora(Editora editora) {
		String sql = "INSERT INTO editora (nome, email)" + "VALUES(?,?)";
		
		Connection conn = connection.conexao();
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			
			prepareStatement.setString(1, "tec");
			prepareStatement.setString(2, "tec@gmail.com");
			
			prepareStatement.execute();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public List<Editora> listarEditora(){
		List<Editora> editoras = new ArrayList<Editora>();
		
		Connection conn = connection.conexao();
		
		
		
		try {
			String sql = "SELECT *FROM editora";
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			//conn.close();
			
			while(resultado.next()) {
				Editora editora = new Editora();
				editora.setIdEditora(resultado.getLong("IdEditora"));
				editora.setNome(resultado.getString("Nome"));
				editora.setEmail(resultado.getString("Email"));
				
				editoras.add(editora);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editoras;
	}
	
	public Editora BuscarEditora(Long id) {
		
		Editora editora = new Editora();
		
		Connection conn = connection.conexao();
		try {
		String sql = "SELECT * FROM editora WHERE idEditora = ?";
		
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		
		prepareStatement.setLong(1,  id);
		ResultSet resultado = prepareStatement.executeQuery();
		
		resultado.next();
		editora.setIdEditora(resultado.getLong("idEditora"));
			editora.setNome(resultado.getString("Nome"));
			editora.setEmail(resultado.getString("Email"));
		
		} catch (SQLException e) {
			e.printStackTrace();
	}
		return editora;
	}
	
	public void alterarEditora(Editora editora) {
		Connection conn = connection.conexao();
		
		try {
			String sql = " Update editora set nome = ?, email = ?  where idEditora = ? ";
			
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, editora.getNome());
			prepareStatement.setString(2, editora.getEmail());
			prepareStatement.setLong(3, editora.getIdEditora());
			
			prepareStatement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
	
	public Editora excluirEditora(Long id) {		
		Editora editora = new Editora();
		Connection conn = connection.conexao();
		
		try {			
			String sql = " Delete from editora where idEditora = ?";
			
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setLong(1, id);
			prepareStatement.execute();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return editora;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
