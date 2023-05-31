package Exercicios.Constrututores.Exercicio2;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fabiano", "N460997");
        Aluno aluno2 = new Aluno("11/09/1999");
        Aluno aluno3 = new Aluno("Fabiano", "11/09/1999", 2023);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}
