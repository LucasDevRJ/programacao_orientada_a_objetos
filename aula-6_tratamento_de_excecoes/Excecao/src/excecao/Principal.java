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
		
		System.out.println();
		
		Usuario usuario1 = new Usuario(1, "Jorge", "111.111.111-11");
		Usuario usuario2 = new Usuario(2, "Fábio", "222.222.22-22");
		Usuario usuario3 = usuario1;
		
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1 == usuario3);
		
		System.out.println();
		
		//irá dar falso pq o conteúdo é distinto
		System.out.println(usuario1.equals(usuario2));
		
		//irá dar verdadeiro pq o conteúdo é o mesmo
		System.out.println(usuario1.equals(usuario3));
		
		Usuario usuario4 = new Usuario(3, "Vinicius", "333.333.333-33");
		
		System.out.println(usuario4);
	}
}
