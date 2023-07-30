package exercicios;

import java.util.Scanner;

public class Conta {
	
	private String nome;
	private float saldo;
	
	public void depositar() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a conta que deseja transferir o dinheiro: ");
		int numero = entrada.nextInt();
		
		System.out.print("Digite o valor que deseja depositar: ");
		float valor = entrada.nextFloat();
		
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido!");
		}
		
		if (valor > this.saldo) {
			throw new ValorInvalidoException("Saldo insuficiente!");
		}
	}
}
