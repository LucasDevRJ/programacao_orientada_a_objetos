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
			this.desconto = desconto;
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
}
