package Exercicios.Constrututores.Exercicio2;

public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private int anoIngresso;

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento
                + ", dataIngresso=" + anoIngresso + "]";
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
    }
}
