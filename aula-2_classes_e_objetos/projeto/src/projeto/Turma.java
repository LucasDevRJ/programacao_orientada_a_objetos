package projeto;

import java.util.ArrayList;

public class Turma {
	String nome;
	Professor professor;
	ArrayList<Aluno> alunos;
	
	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
}
