package Exercicio1_POO.Exercicio6;

public class Universidade {
    public String CPF;
    public String nome;
    public String email;
    public String curso;

    public void cadastraAluno(String CPF, String nome, String email, String curso) {
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.curso = curso;

        System.out.println("\nO aluno " + nome + " foi cadastrado com sucesso!");
    }

    public boolean validaCPF(String CPF) {
        CPF = CPF.replaceAll("[^0-9]", "");

        if (CPF.length() == 11) {
            return true;

        } else {
            return false;
        }
    }
}
