package Exercicio2_POO_Slides.classes_atributos_metodos.Exercicio4;

import Exercicio2_POO_Slides.classes_atributos_metodos.Exercicio3.Carro;
import java.util.Scanner;

public class LocadoraVeiculos {

    public static void main(String[] args) {
        Carro carro = new Carro();

        Moto moto1 = new Moto();
        Moto moto2 = new Moto();

        String fabricante;
        String modelo;
        String marca;
        int cilindradas;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o fabricante do carro: ");
        fabricante = scan.nextLine();

        System.out.println("Digite o modelo do carro: ");
        modelo = scan.nextLine();

        carro.atribuiValores(fabricante, modelo);

        System.out.println("\nDigite a marca da primeira moto: ");
        marca = scan.nextLine();

        System.out.println("Digite o modelo da primeira moto: ");
        modelo = scan.nextLine();

        System.out.println("Digite as cilindradas da primeira moto: ");
        cilindradas = Integer.parseInt(scan.nextLine().toString());

        moto1.atribuiValores(marca, modelo, cilindradas);

        System.out.println("\nDigite a marca da segunda moto: ");
        marca = scan.nextLine();

        System.out.println("Digite o modelo da segunda moto: ");
        modelo = scan.nextLine();

        System.out.println("Digite as cilindradas da segunda moto: ");
        cilindradas = scan.nextInt();

        moto2.atribuiValores(marca, modelo, cilindradas);

        scan.close();

        carro.retornaValores();
        moto1.retornaValores();
        moto2.retornaValores();
    }
}