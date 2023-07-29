package excecao;

import java.util.Scanner;

public class PropriaExcecao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor entre 0 e 10: ");
		int valor = entrada.nextInt();
		
//		try { Exceção tratada
//			if (valor > 10 || valor < 0) {
//				throw new Exception("Valor inválido!");
//			}
//		} catch (Exception e) {
//			System.out.println("Aconteceu um problema: " + e.getMessage());
//		}
		
		//Exceção não tratada
		if (valor > 10 || valor < 0) {
			throw new RuntimeException("Valor inválido!");
		}
	}
}
