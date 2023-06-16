package Model;

public class Editora {

	private long idEditora;
	private String nome;
	private String email;
	
	public long getIdEditora() {
		return idEditora;
	}
	public void setIdEditora(long idEditora) {
		this.idEditora = idEditora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Editora [idEditora=" + idEditora + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
}
