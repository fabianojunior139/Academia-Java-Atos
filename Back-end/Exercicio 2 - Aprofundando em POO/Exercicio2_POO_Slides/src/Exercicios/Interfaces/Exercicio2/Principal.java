package Exercicios.Interfaces.Exercicio2;

public class Principal {
    public static void main(String[] args) {
        Pessoal compromissoPessoal = new Pessoal("Cortar o cabelo", "02/05/2023", "10:00");
        Profissional compromissoProfissional = new Profissional("Reunião com cliente", "03/05/2023", "14:00");

        compromissoPessoal.exibeCompromissoPessoal();
        compromissoProfissional.exibeCompromissoProfissional();
    }
}
