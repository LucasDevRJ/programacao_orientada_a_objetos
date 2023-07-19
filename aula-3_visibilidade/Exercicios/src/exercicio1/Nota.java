package exercicio1;

public class Nota {
	private double nota1;
	private double nota2;
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void exibeResultadoMedia() {
		double media = (nota1 + nota2) / 2;
		if (media >= 6.0) {
			System.out.println("O aluno está aprovado!");
		} else if (media >= 4.0) {
			System.out.println("O aluno está de prova final");
			System.out.println("O aluno precisará tirar no minímo 6.0");
		} else {
			System.out.println("O aluno está reprovado!");
		}
	}
}
