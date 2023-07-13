package exercicios;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		int N;
		String palavra;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de palavras a serem digitadas: ");
		N = entrada.nextInt();
		
		String[] palavras = new String[N];
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.print("Digite uma palavra: ");
			palavra = entrada.next();
			palavras[i] = palavra;
		}
		
		for (int i = N-1; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}
}
