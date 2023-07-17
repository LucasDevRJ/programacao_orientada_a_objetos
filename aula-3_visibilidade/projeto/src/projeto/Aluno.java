package projeto;

public class Aluno {
	/*
	 * private = somente esta classe pode acessar
	 * public = todas as classes podem acessar
	 * protected = classes filhas podem acessar
	 */
	private int matricula; 
	public String nome;
	public String cpf;
	protected int notas[];
	
	public Aluno(int matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Aluno() {
		
	}

	public void info() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}
