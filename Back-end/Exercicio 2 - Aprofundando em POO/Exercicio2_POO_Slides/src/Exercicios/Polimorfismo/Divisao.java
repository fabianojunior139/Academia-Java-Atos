package Exercicios.Polimorfismo;

public class Divisao extends Calculadora {
    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 / valor2;
    }
}
