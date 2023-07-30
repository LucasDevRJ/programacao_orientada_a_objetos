package exercicios;

import java.util.Scanner;

public class Conta {
	
	private String nome;
	private float saldo;
	 
	public Conta(String nome, float saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void depositar() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja depositar: ");
		float valor = entrada.nextFloat();
		
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido!");
		}
		
		this.saldo += valor;
		
		System.out.println("Valor depositado com sucesso!");
	}
	
	public void sacar() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja sacar: ");
		float valor = entrada.nextFloat();
		
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido!");
		}
		
		if (valor > this.saldo) {
			throw new ValorInvalidoException("Saldo insuficiente!");
		}
		
		this.saldo -= valor;
		
		System.out.println("Valor sacado com sucesso!");
	}
	
	public void transferir(Conta conta) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja transferir: ");
		float valor = entrada.nextFloat();
		
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido!");
		}
		
		if (valor > this.saldo) {
			throw new ValorInvalidoException("Saldo insuficiente!");
		}
		
		this.saldo -= valor;
		conta.saldo += valor;
		
		System.out.println("Valor transferido com sucesso!");
	}
}
