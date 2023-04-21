package Exercicio2_POO_Slides.constrututores.Exercicio1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String retornaIdade() {
        return ("Idade: " + this.idade);
    }

    public String retornaNomeIdade() {
        return ("Nome: " + this.nome + ", idade: " + this.idade);
    }
}

