package Exercicio2_POO_Slides.herenca.Exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        //Criando o primeiro funcionário
        System.out.println("Informe o nome do primeiro funcionário: ");
        funcionario1.nome = scan.nextLine();

        System.out.println("Informe a idade do primeiro funcionário: ");
        funcionario1.idade = Integer.parseInt(scan.nextLine().toString());

        System.out.println("Informe o telefone do primeiro funcionário: ");
        funcionario1.telefone = scan.nextLine();

        System.out.println("Informe o setor do primeiro funcionário: ");
        funcionario1.setor = scan.nextLine();

        System.out.println("Informe o cargo do primeiro funcionário: ");
        funcionario1.cargo = scan.nextLine();

        System.out.println("Informe a função do primeiro funcionário: ");
        funcionario1.funcao = scan.nextLine();

        funcionario1.atribuiValores(Pessoa.nome, Pessoa.idade, Pessoa.telefone, funcionario1.setor, funcionario1.cargo, funcionario1.funcao);

        //Criando o segundo funcionário
        System.out.println("\nInforme o nome do segundo funcionário: ");
        funcionario2.nome = scan.nextLine();

        System.out.println("Informe a idade do segundo funcionário: ");
        funcionario2.idade = Integer.parseInt(scan.nextLine().toString());

        System.out.println("Informe o telefone do segundo funcionário: ");
        funcionario2.telefone = scan.nextLine();

        System.out.println("Informe o setor do segundo funcionário: ");
        funcionario2.setor = scan.nextLine();

        System.out.println("Informe o cargo do segundo funcionário: ");
        funcionario2.cargo = scan.nextLine();

        System.out.println("Informe a função do segundo funcionário: ");
        funcionario2.funcao = scan.nextLine();

        funcionario2.atribuiValores(Pessoa.nome, Pessoa.idade, Pessoa.telefone, funcionario2.setor, funcionario2.cargo, funcionario2.funcao);

        //Criando o terceiro funcionário
        System.out.println("\nInforme o nome do terceiro funcionário: ");
        funcionario3.nome = scan.nextLine();

        System.out.println("Informe a idade do terceiro funcionário: ");
        funcionario3.idade = Integer.parseInt(scan.nextLine().toString());

        System.out.println("Informe o telefone do terceiro funcionário: ");
        funcionario3.telefone = scan.nextLine();

        System.out.println("Informe o setor do terceiro funcionário: ");
        funcionario3.setor = scan.nextLine();

        System.out.println("Informe o cargo do terceiro funcionário: ");
        funcionario3.cargo = scan.nextLine();

        System.out.println("Informe a função do terceiro funcionário: ");
        funcionario3.funcao = scan.nextLine();

        funcionario3.atribuiValores(Pessoa.nome, Pessoa.idade, Pessoa.telefone, funcionario3.setor, funcionario3.cargo, funcionario3.funcao);

        funcionario1.retornaValores();
        funcionario2.retornaValores();
        funcionario3.retornaValores();
    }
}
