package Exercicios.Polimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valor1;
        double valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Digite o primeiro valor: ");
        valor2 = scan.nextDouble();

        Calculadora soma = new Calculadora();
        System.out.println("\nSoma dos valores passados: " + soma.calcular(valor1, valor2));

        Subtracao subtracao = new Subtracao();
        System.out.println("Subtração dos números passados: " + subtracao.calcular(valor1, valor2));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println("Multiplicação dos números passados: " + multiplicacao.calcular(valor1, valor2));

        Divisao divisao = new Divisao();
        System.out.println("Divisão dos números passados: " + divisao.calcular(valor1, valor2));
    }
}
