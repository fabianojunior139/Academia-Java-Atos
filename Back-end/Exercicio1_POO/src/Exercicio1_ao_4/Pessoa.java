package Exercicio1_ao_4;

public class Pessoa {
	public String nome;
	public String email;
	public String CPF;

	public void atribuiValores(String nome, String email, String CPF ) {
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
	}
	
	public void retornaValores() {
		System.out.println("Nome da pessoa: " + this.nome);
		System.out.println("Email da pessoa: " + this.email);
		System.out.println("CPF da pessoa: " + this.CPF);
	}
}
