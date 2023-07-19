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
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
