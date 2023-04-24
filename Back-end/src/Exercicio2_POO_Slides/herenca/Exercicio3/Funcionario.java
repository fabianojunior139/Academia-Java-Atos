package Exercicio2_POO_Slides.herenca.Exercicio3;

public class Funcionario extends Pessoa {
    public String setor;
    public String cargo;
    public String funcao;

    public void atribuiValores(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
        Pessoa.nome = nome;
        Pessoa.idade = idade;
        Pessoa.telefone = telefone;
        this.setor = setor;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public void retornaValores() {
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Idade do funcionário: " + idade);
        System.out.println("Telefone do funcionário: " + telefone);
        System.out.println("Setor do funcionário: " + this.setor);
        System.out.println("Cargo do funcionário : " + this.cargo);
        System.out.println("Função do funcionário: " + this.funcao);
    }

}
