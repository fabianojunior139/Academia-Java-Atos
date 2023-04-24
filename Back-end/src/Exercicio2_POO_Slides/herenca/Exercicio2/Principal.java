package Exercicio2_POO_Slides.herenca.Exercicio2;

import java.util.Scanner;

public class Principal extends Pessoa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        nome = scan.nextLine();

        System.out.println("Informe a idade: ");
        idade = Integer.parseInt(scan.nextLine().toString());

        System.out.println("Informe o tipo: ");
        tipo = scan.nextLine();

        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Tipo: " + tipo);
        falar();
        andar();

        scan.close();
    }

}
