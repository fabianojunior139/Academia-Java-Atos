package Exercicio2_POO_Slides.herenca.Exercicio4;

import java.util.Scanner;

public class Netbook extends Computador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a marca do netbook: ");
        marca = scan.nextLine();

        scan.close();

        System.out.println("A marca do netbook é: " + marca + ", e o modelo é: " + modelo);
    }
}
