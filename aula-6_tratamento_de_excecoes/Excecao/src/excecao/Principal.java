package excecao;

public class Principal {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3};
		
		
		try {
			System.out.println(numeros[10]);
		} catch(Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
	}
}
