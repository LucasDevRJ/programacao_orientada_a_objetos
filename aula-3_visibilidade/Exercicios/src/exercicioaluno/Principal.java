package exercicioaluno;

public class Principal {
	public static void main(String[] args) {
		Nota nota = new Nota(7.4, 6.3, 3);
		nota.exibeResultadoMedia();
		
		Nota nota2 = new Nota(3.7, 4.2, 4);
		nota2.exibeResultadoMedia();
		
		Nota nota3 = new Nota(4.0, 4.0, 6);
		nota3.exibeResultadoMedia();
		
		Nota nota4 = new Nota(8.0, 7.0, 9);
		nota4.exibeResultadoMedia();
		
		Curso curso = new Curso("Engenharia de Software", 600.0);
		
		Aluno aluno = new Aluno("Gustavo Vieira", 564563, 30.0, curso);
		
		aluno.descrever();
		System.out.println();
		aluno.exibePagamento();
		System.out.println();
		curso.descrever();
		
		
		Curso curso2 = new Curso("Sistemas de Informação", 800.0);
		
		Aluno aluno2 = new Aluno("Nicholas Ricardo", 743564, 50.0, curso2);
		
		aluno2.descrever();
		System.out.println();
		aluno2.exibePagamento();
		System.out.println();
		curso2.descrever();
	}
}
