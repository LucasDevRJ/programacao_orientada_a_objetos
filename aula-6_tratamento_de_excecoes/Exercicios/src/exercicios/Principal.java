package exercicios;

public class Principal {
	
	public static int[] instanciaArray(int n) {
		return new int[n];
	}
	
	public static void main(String[] args) {
//		Conta conta1 = new Conta("Lucas", 1200);
//		Conta conta2 = new Conta("Jorge", 1600);		
//		conta1.depositar();
//		conta1.sacar();
//		conta1.transferir(conta2);
//		System.out.println(conta1.getSaldo());
//		System.out.println(conta2.getSaldo());
		
		int tamanho = -10;
		int array[];
		
		try {
			array = instanciaArray(tamanho);
			for (int i = 0; i < tamanho; i++) {
				System.out.println(array[i]);
			}
		} catch (NegativeArraySizeException e) {
			System.out.println("Valor inválido, digite outro");
			System.out.println(e.getMessage());
		}
	}
}
