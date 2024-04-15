package aula8;

import aula8.interfaces.Corrida;

public class Cachorro extends Animal implements Corrida {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
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
	
	@Override
	public String toString() {
		return "Animal{"+
				"nome="+ nome +"/"+
				", idade="+ idade +
				"}";
	}

}
