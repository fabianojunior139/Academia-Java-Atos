package Exercicios.Heranca.Exercicio1;

public class Usuario {
    protected static String nome;
    protected static String email;
    protected static String telefone;

    public static String retornaDados() {
        return ("Nome: " + nome + ", E-mail: " + email + ", Telefone: " + telefone);
    }
}
