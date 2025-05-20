package projetocrypto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Conexao;

public class Usuario {
	private int    idUsuario;
	private String email;
	private String senha;
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public boolean incluirUsuario() throws ClassNotFoundException {
		Connection con = Conexao.conectar();
		String sql = "INSERT INTO usuario (email,senha) VALUES (?,?);";
		try { 
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.email);
            stm.setString(2, this.senha);
            stm.execute();
        } catch (SQLException erro) {
            System.out.println("Problema na inclusão do usuário " + erro);
            return false;
        }
		return true;
	}
	
	
	public boolean autenticarUsuario() throws ClassNotFoundException {
		Connection con = Conexao.conectar();
		String sql = "select idusuario from usuario where email = ? and senha = ?";
		try { 
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.email);
            stm.setString(2, this.senha);
        } catch (SQLException erro) {
            System.out.println("Problema na autenticação do usuário " + erro);
            return false;
        }
		return true;
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
