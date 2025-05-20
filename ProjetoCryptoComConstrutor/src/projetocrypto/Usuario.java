package projetocrypto;

public class Usuario {
	private int    idUsuario;
	private String email;
	private String senha;
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}


	public void listarDados() {
		System.out.println("Email ....: " + this.getEmail());
		System.out.println("Senha ....: " + this.getSenha());
	}


	public int getIdUsuario() {
		return idUsuario;
	}

	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}


}
