package polimorfismo;

public abstract class Funcionario {
	String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public abstract float pagamento();
}
