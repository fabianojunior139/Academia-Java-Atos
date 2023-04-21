package Exercicio2_POO_Slides.classes_atributos_metodos.Exercicio2;

public class Disciplina {
    public static void main(String[] args) {
        Professor professor = new Professor();

        Laboratorio laboratorio = new Laboratorio();

        professor.nome = "Fabiano Duarte";

        laboratorio.local = "Sala 2";

        System.out.println("O nome do professor é: " + professor.nome);
        System.out.println("O local da aula é: " + laboratorio.local);
    }
}
