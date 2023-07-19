package exercicio;

public class Aluno {
	private String nome;
	private int matricula;
	private double desconto;
	private Curso curso;
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		setNome(nome);
		setMatricula(matricula);
		setDesconto(desconto);
		setCurso(curso);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Digite o nome do aluno!");
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
		}
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		if (desconto > 0.0 && desconto <= 100.0) {
			this.desconto = desconto / 100.0;
		} else {
			System.out.println("Desconto inválido");
		}
		
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void exibePagamento() {
		double mensalidadeComDesconto = this.curso.getMensalidade() - (this.curso.getMensalidade() * this.desconto);
		System.out.printf("O aluno %s paga de mensalidade o valor de R$ %.2f no curso de %s", this.nome, mensalidadeComDesconto, this.curso.getNome());
	}
	
	public void descrever() {
		System.out.println("Aluno: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Desconto: " + this.desconto * 100 + "%");
		System.out.println("Curso: " + this.curso.getNome());
	}
}
