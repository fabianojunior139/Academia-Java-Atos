package Exercicios.Classes_herancas_metodos.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.idade = 25;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.idade = 23;

        System.out.println("A idade da pessoa é: " + pessoa1.idade);
        System.out.println("A idade da pessoa é: " + pessoa2.idade);
        System.out.println("A idade da pessoa é: " + pessoa3.idade);
    }
}
