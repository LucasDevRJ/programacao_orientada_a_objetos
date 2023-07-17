package projeto;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	//construtor para adicionar valores ao criar o objeto
//	 Aluno(int pMatricula, String pNome, String pCpf) {
//		matricula = pMatricula;
//		nome = pNome;
//		cpf = pCpf;
//	}
	
	//forma mais usual
	Aluno(int matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//construtor padrão sem nada
	 Aluno() {
		
	}

	void info() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}
