package Exercicios.Classes_herancas_metodos.Exercicio3;

public class Carro {
    private String fabricante;
    private String modelo;

    public void atribuiValores(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public void retornaValores() {
        System.out.println(this.fabricante + " " + this.modelo );
    }
}
