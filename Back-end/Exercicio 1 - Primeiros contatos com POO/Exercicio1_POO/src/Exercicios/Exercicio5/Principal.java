package Exercicios.Exercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String nome;
        String email;
        String matricula;

        Scanner scan = new Scanner(System.in);

        //Solicitando dados do primeiro aluno
        System.out.println("Escreva o nome do primeiro aluno:");
        nome = scan.nextLine();

        System.out.println("Escreva o email do primeiro aluno: ");
        email = scan.nextLine();

        System.out.println("Escreva a matricula do primeiro aluno: ");
        matricula = scan.nextLine();

        //Instanciado o primeiro aluno passando os parâmetros necessários para criação do objeto
        Aluno aluno1 = new Aluno(nome, email, matricula);


        //Solicitando dados do segundo aluno
        System.out.println("\nEscreva o nome do segundo aluno: ");
        nome = scan.nextLine();

        System.out.println("Escreva o email do segundo aluno: ");
        email = scan.nextLine();

        System.out.println("Escreva a matricula do segundo aluno: ");
        matricula = scan.nextLine();

        //Instanciado o primeiro aluno passando os parâmetros necessários para criação do objeto
        Aluno aluno2 = new Aluno(nome, email, matricula);


        //Solicitando dados do terceiro aluno
        System.out.println("\nEscreva o nome do terceiro aluno: ");
        nome = scan.nextLine();

        System.out.println("Escreva o email do terceiro aluno: ");
        email = scan.nextLine();

        System.out.println("Escreva a matricula do terceiro aluno: ");
        matricula = scan.nextLine();

        //Instanciado o terceiro aluno e passando os parâmetros necessários para criação do objeto
        Aluno aluno3 = new Aluno(nome, email, matricula);

        scan.close();

        System.out.println("Aluno cadastrados no sistema:\n");
        //Retornando os valores cadastrados anteriormente
        aluno1.retornaValores();
        aluno2.retornaValores();
        aluno3.retornaValores();
    }
}
