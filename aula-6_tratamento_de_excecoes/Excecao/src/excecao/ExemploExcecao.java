package excecao;

public class ExemploExcecao {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3};
		
		
		try {
			numeros[0] = numeros[0] / 0; //cairá na Exception
			System.out.println(numeros[10]);
		} catch(ArrayIndexOutOfBoundsException e) { //exceção especifica
			System.out.println("Fora do limite: " + e.getMessage());
			return;
		} catch(Exception e) { //exceção generica
			System.out.println("Ocorreu um problema: " + e.getMessage());
		} finally { //será executado de todo o modo
			System.out.println("Finalizando o programa.");
		}
	}
}
