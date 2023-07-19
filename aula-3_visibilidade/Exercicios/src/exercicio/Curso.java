package exercicio;

public class Curso {
	private String nome;
	private double mensalidade;
	
	public Curso(String nome, double mensalidade) {
		setNome(nome);
		setMensalidade(mensalidade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Digite o nome do curso!");
		}
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(double mensalidade) {
		if (mensalidade > 0.0) {
			this.mensalidade = mensalidade;
		} else {
			System.out.println("Digite o valor da mensalidade!");
		}
	}
	
	public void descrever() {
		System.out.println("Curso: " + this.nome);
		System.out.println("Mensalidade: R$ " + this.mensalidade);
	}
}
