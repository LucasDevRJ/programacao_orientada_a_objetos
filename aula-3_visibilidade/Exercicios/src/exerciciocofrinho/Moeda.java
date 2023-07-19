package exerciciocofrinho;

public class Moeda {
	private double valor;
	private String nome;
	
	public Moeda(double valor, String nome) {
		setNome(nome);
		setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		if (valor > 0.0) {
			this.valor = valor;
		} else {
			System.out.println("Valor inválido!");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Digite o nome da moeda!");
		}
	}
}
