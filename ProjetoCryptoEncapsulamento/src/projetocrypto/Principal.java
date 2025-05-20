package projetocrypto;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Usuario usu = new Usuario();
		
		System.out.println("Informe o email");
		usu.setEmail(sc.next()); 
		System.out.println("Informe a senha");
		usu.setSenha(sc.next());
		//usu.listarDados();
		System.out.println("Email ....: " + usu.getEmail());
		System.out.println("Senha ....: " + usu.getSenha());

		sc.close();
	}

}
