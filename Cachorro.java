import interfaces.Corrida;

public class Cachorro extends Animal implements Corrida {

	public Cachorro(String nome, int idade, TipoAnimal t) {
		super(nome, idade, t);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au Au");
	}

	@Override
	public void correr() {
		System.out.println("Correndo");
	}

}
