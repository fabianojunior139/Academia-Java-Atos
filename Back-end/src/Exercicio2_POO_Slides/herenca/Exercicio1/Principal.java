package Exercicio2_POO_Slides.herenca.Exercicio1;

import java.util.Scanner;

public class Principal extends Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        nome = scan.nextLine();

        System.out.println("Digite o e-mail do usuário: ");
        email = scan.nextLine();

        System.out.println("Digite o telefone do usuário: ");
        telefone = scan.nextLine();

        System.out.println(Usuario.retornaDados());
    }
}
