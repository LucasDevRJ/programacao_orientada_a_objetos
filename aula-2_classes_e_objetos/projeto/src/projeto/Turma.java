package projeto;

import java.util.ArrayList;

public class Turma {
	String nome;
	Professor professor;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
}
