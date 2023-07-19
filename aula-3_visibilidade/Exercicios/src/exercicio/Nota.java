package exercicio;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		if (nota1 >= 0.0 && nota1 <= 10.0) {
			this.nota1 = nota1;
		} else {
			System.out.println("Nota 1 inválida!");
		}
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		if (nota2 >= 0.0 && nota2 <= 10.0) {
			this.nota2 = nota2;
		} else {
			System.out.println("Nota 2 inválida!");
		}
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void setFaltas(int faltas) {
		if (faltas > 0 && faltas <= 35) {
			this.faltas = faltas;
		} else {
			System.out.println("Número de faltas inválido!");
		}
	}
	
	public void exibeResultadoMedia() {
		double media = (this.nota1 + this.nota2) / 2;
		if (faltas < 7) {
			if (media >= 6.0) {
				System.out.println("O aluno está aprovado!");
			} else if (media >= 4.0) {
				System.out.println("O aluno está de prova final");
				System.out.println("O aluno precisará tirar no minímo 6.0");
			} else {
				System.out.println("O aluno está reprovado!");
			}
		} else {
			System.out.println("O aluno está reprovado por faltas!");
		}
	}
}
