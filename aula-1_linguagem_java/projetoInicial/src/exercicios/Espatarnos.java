package exercicios;

import java.util.Scanner;

public class Espatarnos {
	public static void main(String[] args) {
		int quantidadeSoldados;
		int chances = 3;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Adivinhe quantos soldados os espartanos de Leonidas enfrentaram: ");
			quantidadeSoldados = entrada.nextInt();
			
			if (quantidadeSoldados > 10000) {
				System.out.println("O número adivinhado é acima do valor!!");
				chances--;
			} else if (quantidadeSoldados < 10000) {
				System.out.println("O número adivinhado é abaixo do valor!!");
				chances--;
			} else {
				System.out.println("Acertou!!");
				break;
			}
		} while (chances > 0);
		
		if (chances == 0) {
			System.out.println("Game Over");
		}
	}
}
