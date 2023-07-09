package empresa; //toda instrução Java termina com ponto e virgula

import java.util.Scanner;

//public = quais classes consegue ver esse arquivo
public class Principal {
	//as instruções começam e terminam entre chaves
	public static void main(String[] args) {
		//static = função global no código
		//void = o que a função retorna
		//esta é a função principal que começará a execução do código
		
		//int idade = 10; //variável do tipo de número inteiro
		//double peso = 72.5; //variável do tipo ponto flutuante
		
		System.out.print("Alô Mamãe!"); //exibe a mensagem, mas não quebra linha
		System.out.println("Alô Papai!");
		
		int idade;
		double peso;
		
		//idade = idade + 2;
		
		//para conseguir entrar dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt(); //entrada de valor
		
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		
		System.out.printf("Idade = %d\n", idade); //exibe mensagem com formatação
		System.out.printf("Peso = %.2f", peso);
	}

}
