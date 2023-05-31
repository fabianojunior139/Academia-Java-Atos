package Exercicios.Polimorfismo;

public class Calculadora {
    private double resultado;

    public double calcular(double valor1, double valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double exibeResultado() {
        return resultado;
    }
}
