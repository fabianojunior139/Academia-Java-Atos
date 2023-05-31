package Exercicios.Constrututores.Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa;
        Scanner scan = new Scanner(System.in);

        int opcao = 1;

        System.out.println("Selecione se deseja criar com um ou dois construtores");

        while (opcao != 3) {
            System.out.println(
                    "\nDigite 1 para inicializar o construtor com apenas um parâmetro, 2 para inicializar com 2 parâmetros e 3 para sair.");
            opcao = Integer.parseInt(scan.nextLine().toString());

            switch (opcao) {
                case 1:
                    System.out.println("Digite a idade: ");

                    pessoa = new Pessoa(Integer.parseInt(scan.nextLine().toString()));
                    System.out.println(pessoa.retornaIdade());
                    break;

                case 2:
                    String nome;
                    int idade;

                    System.out.println("Digite o nome: ");
                    nome = scan.nextLine();

                    System.out.println("Digite a idade: ");
                    idade = Integer.parseInt(scan.nextLine().toString());

                    pessoa = new Pessoa(nome, idade);
                    System.out.println(pessoa.retornaNomeIdade());
                    break;

                case 3:
                    System.out.println("\nObrigado e volte sempre!");
                    opcao = 3;
                    break;

                default:
                    System.out.println("Opção inválida, insira alguma das opções: ");
            }
        }
    }
}
