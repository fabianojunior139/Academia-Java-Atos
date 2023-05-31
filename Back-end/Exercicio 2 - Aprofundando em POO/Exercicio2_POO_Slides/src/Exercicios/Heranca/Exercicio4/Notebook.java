package Exercicios.Heranca.Exercicio4;

import java.util.Scanner;

public class Notebook extends Computador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a marca do notebook: ");
        marca = scan.nextLine();

        scan.close();

        System.out.println("A marca do notebook é: " + marca + ", e o modelo é: " + modelo);
    }
}
