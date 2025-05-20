package projetocrypto;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o email");
		String vEmail = sc.next(); 
		System.out.println("Informe a senha");
		String vSenha = sc.next();

		Usuario usu = new Usuario(vEmail, vSenha);
		
		System.out.println("Email ....: " + usu.getEmail());
		System.out.println("Senha ....: " + usu.getSenha());

		sc.close();
	}

}
