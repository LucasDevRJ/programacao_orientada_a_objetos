package projeto;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.matricula= 111;
		aluno.nome = "Super Mario";
		aluno.cpf = "111222333";
		
		aluno.info();
		
		aluno.nome = "Luigi";
		aluno.info();
	}
}
