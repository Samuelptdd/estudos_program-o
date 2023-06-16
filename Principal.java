package Model;

import java.util.List;

import javax.swing.JOptionPane;

import DAO.EditoraDAO;

public class Principal {

	public static void main(String[] args) {
		
//		Editora ed = new Editora();
//		EditoraDAO edDAO = new EditoraDAO();
//		
//		ed.setNome("Tec");
//		ed.setEmail("Tec@gmail.com");
//		
//		edDAO.salvarEditora(ed);
		
//		List<Editora> editoras = edDAO.listarEditora();
//		
//		for (Editora editora : editoras) {
//			System.out.println(editora);
//			System.out.println("-----------------------------------------");
//		}
		
//		Editora editora = edDAO.BuscarEditora(1L);		
//		System.out.println(editora);
		
//		ed.setIdEditora(Long.parseLong((JOptionPane.showInputDialog("Informe o id da Editora" , "Informe aqui :D"))));
//		
//		ed.setNome(JOptionPane.showInputDialog("Informe o nome da Editora:" , "Informe aqui :D"));
//		ed.setEmail(JOptionPane.showInputDialog("Informe o email da Editora:" ,  "Informe aqui :D"));
//		
//		edDAO.alterarEditora(ed);
		
		
		EditoraDAO edDAO = new EditoraDAO();
		Editora editora = edDAO.excluirEditora(1L);
		
		List<Editora> editoras = edDAO.listarEditora();
		
		for (Editora ed : editoras) {
			System.out.println(ed);
			System.out.println("-----------------------------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
