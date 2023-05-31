package Exercicios.Interfaces.Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal p = new Principal();
        p.exibeMensagemA();
        p.exibeMensagemB();
    }

    public void exibeMensagemA() {
        System.out.println("Cuide bem dos animais!");
    }

    public void exibeMensagemB() {
        Scanner scan = new Scanner(System.in);

        String mensagem;

        System.out.println("\nInsira uma mensagem de para preservação do planeta: ");
        mensagem = scan.nextLine();

        System.out.println("\nMensagem: " + mensagem);

        scan.close();
    }
}
