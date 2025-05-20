package projetocrypto;

public class Usuario {
	private int    idUsuario;
	private String email;
	private String senha;
		
	public void listarDados() {
		System.out.println("Email ....: " + this.getEmail());
		System.out.println("Senha ....: " + this.getSenha());
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
