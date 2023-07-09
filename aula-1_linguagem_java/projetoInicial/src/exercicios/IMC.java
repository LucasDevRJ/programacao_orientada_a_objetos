package exercicios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.printf("O seu IMC é %.2f", imc);
	}
	
}
