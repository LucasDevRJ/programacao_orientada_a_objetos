package projeto;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.matricula= 1001;
		aluno.nome = "Super Mario";
		aluno.cpf = "111222333";
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula= 1002;
		aluno2.nome = "Yoshi";
		aluno2.cpf = "777222555";
		
		aluno.info();
		aluno2.info();
		
		aluno.nome = "Luigi";
		aluno.info();
		
		Carro carro = new Carro();
		//Carro.nome = "Citroen"; não é permitido a alteração
		Carro.modelo = "Ford K";
		System.out.println(Carro.modelo);
		//carro.milhasParaMetros(10); como é static não é preciso instanciar
		System.out.println(Carro.milhasParaMetros(10));
		
		Professor professor = new Professor();
		professor.nome = "Leonardo";
		professor.formacao = "Ciência da Computação";
		professor.cadastro = 1;
		
		professor.info();
		
		Turma turma = new Turma();
		turma.nome = "101";
		turma.professor = professor;
		turma.adicionarAluno(aluno);
		turma.adicionarAluno(aluno2);
		
		//outra forma de se fazer
		Turma turma2 = new Turma();
		turma2.professor = new Professor();
		turma2.professor.nome = "Gustavo";
		turma2.professor.formacao = "TUDO";
		turma2.alunos = new ArrayList();
		turma2.alunos.add(new Aluno());
		turma2.alunos.get(0).nome = "Lucas Pereira";
		System.out.println(turma2.professor.nome);
		System.out.println(turma2.alunos.get(0).nome);
		
		Aluno aluno3 = new Aluno(1003, "Lion", "444333");
		System.out.println(aluno3.nome);
		
		turma.adicionarAluno(aluno3);
		
		System.out.println(turma.alunos.get(2).nome);
	}
}
