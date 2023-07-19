package exercicio;

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
	}
}
