package projeto;

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
	}
}
