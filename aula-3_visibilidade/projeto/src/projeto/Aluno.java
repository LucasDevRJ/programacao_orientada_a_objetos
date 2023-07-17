package projeto;

public class Aluno {
	private int matricula;
	public String nome;
	public String cpf;
	protected int notas[];
	
	//construtor para adicionar valores ao criar o objeto
//	 Aluno(int pMatricula, String pNome, String pCpf) {
//		matricula = pMatricula;
//		nome = pNome;
//		cpf = pCpf;
//	}
	
	//forma mais usual
	public Aluno(int matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//construtor padrão sem nada
	public Aluno() {
		
	}

	public void info() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}
