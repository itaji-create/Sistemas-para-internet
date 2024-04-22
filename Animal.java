public abstract class Animal {
	private final TipoAnimal t;
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade, TipoAnimal t) {
		this.nome = nome;
		this.idade = idade;
		this.t = t;
	}
	
	public abstract void emitirSom();
	public String toString() {
		return "Animal{"+
				"nome="+ nome + 2 +"/"+
				", idade="+ idade +
				", tipo=" + t +
				"}";
	}

}
