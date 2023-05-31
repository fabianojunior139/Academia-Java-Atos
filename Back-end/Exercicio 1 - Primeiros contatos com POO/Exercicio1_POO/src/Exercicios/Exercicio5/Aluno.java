package Exercicios.Exercicio5;

public class Aluno {
    private String nome;
    private String email;
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public void retornaValores() {
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Email do aluno: " + this.email);
        System.out.println("Matrícula do aluno: " + this.matricula + "\n");
    }
}
