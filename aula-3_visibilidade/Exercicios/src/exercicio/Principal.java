package exercicio;

public class Principal {
	public static void main(String[] args) {
		Nota nota = new Nota();
		nota.setNota1(7.4);
		nota.setNota2(6.3);
		nota.setFaltas(3);
		nota.exibeResultadoMedia();
		
		Nota nota2 = new Nota();
		nota2.setNota1(3.7);
		nota2.setNota2(4.2);
		nota2.setFaltas(4);
		nota2.exibeResultadoMedia();
		
		Nota nota3 = new Nota();
		nota3.setNota1(4.0);
		nota3.setNota2(4.0);
		nota3.setFaltas(6);
		nota3.exibeResultadoMedia();
		
		Nota nota4 = new Nota();
		nota4.setNota1(8.0);
		nota4.setNota2(7.0);
		nota4.setFaltas(9);
		nota4.exibeResultadoMedia();
	}
}
