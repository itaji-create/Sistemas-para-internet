import interfaces.Voar;

public class Passarinho extends Animal implements Voar {

    public Passarinho(String nome, int idade, TipoAnimal t) {
        super(nome, idade, t);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu");
    }

    @Override
    public void voar() {
        System.out.println("passarinho voando");
    }

}
