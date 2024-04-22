import interfaces.Corrida;

public class Gato extends Animal implements Corrida {

    public Gato(String nome, int idade, TipoAnimal t) {
        super(nome, idade, t);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void correr() {
        System.out.println("gato Correndo");
    }


}
