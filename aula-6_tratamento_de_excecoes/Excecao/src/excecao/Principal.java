package excecao;

public class Principal {
	public static void main(String[] args) {
		String string1 = new String("Mensagem");
		String string2 = new String("Mensagem");
		String string3 = string1;
		
		//apesar da mensagem ser a mesma
		//eles são distintos
		//pois são duas instâncias distintas
		System.out.println(string1 == string2);
		
		//será verdadeiro
		//porque string3 recebe a instancia da string1
		//ao invés de criar uma nova
		//logo os dois são os mesmos
		System.out.println(string1 == string3);
		
		System.out.println();
		
		//será verdadeiro porque comparam o coteúdo
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
	}
}
