package empresa; //toda instrução Java termina com ponto e virgula

//public = quais classes consegue ver esse arquivo
public class Principal {
	//as instruções começam e terminam entre chaves
	public static void main(String[] args) {
		//static = função global no código
		//void = o que a função retorna
		//esta é a função principal que começará a execução do código
		
		int idade = 10;
		
		idade = idade + 2;
		System.out.print("Alô Mamãe!"); //exibe a mensagem, mas não quebra linha
		System.out.println("Alô Papai!");
		
		System.out.println("Idade = " + idade);
	}

}
