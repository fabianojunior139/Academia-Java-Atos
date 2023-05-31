package Exercicios.Classes_herancas_metodos.Exercicio4;

public class Moto {
    private String marca;
    private String modelo;
    private int cilindradas;

    public void atribuiValores(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public void retornaValores() {
        System.out.println(this.marca + " " + this.modelo + " " + this.cilindradas);
    }
}
