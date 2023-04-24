package Exercicio2_POO_Slides.interfaces.Exercicio2;

public class Profissional extends Compromisso implements InterfaceProfissional {

    public Profissional(String nomeDoCompromisso, String data, String hora) {
        super(nomeDoCompromisso, data, hora);
    }

    @Override
    public void exibeCompromissoProfissional() {
        System.out.println(this.nomeDoCompromisso + ": " + this.data + ": " + this.hora);
    }
}
