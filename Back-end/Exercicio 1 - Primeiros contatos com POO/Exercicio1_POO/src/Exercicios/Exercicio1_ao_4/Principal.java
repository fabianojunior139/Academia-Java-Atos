package Exercicios.Exercicio1_ao_4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Pedro";

        String nome;
        String email;
        String CPF;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite seu email: ");
        email = scan.nextLine();

        System.out.println("Digite seu CPF: ");
        CPF = scan.nextLine();

        scan.close();

        pessoa.atribuiValores(nome, email, CPF);
        pessoa.retornaValores();
    }
}
