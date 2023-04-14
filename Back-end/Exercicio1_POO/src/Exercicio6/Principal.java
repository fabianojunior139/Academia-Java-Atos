package Exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Universidade vestibular = new Universidade();

		String CPF;
		String nome;
		String email;
		String curso;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o CPF do aluno: ");
		CPF = scan.nextLine();

		System.out.println("Digite o nome do aluno: ");
		nome = scan.nextLine();

		System.out.println("Digite o email do aluno: ");
		email = scan.nextLine();

		System.out.println("Digite o curso do aluno: ");
		curso = scan.nextLine();
		
		scan.close();

		if (vestibular.validaCPF(CPF) == true) {
			vestibular.cadastraAluno(CPF, nome, email, curso);
		} else {
			System.out.println("\nCPF digitado é inválido!");
		}
	}

}
