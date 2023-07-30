package exercicios;

public class Principal {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Lucas", 1200);
		Conta conta2 = new Conta("Jorge", 1600);		
		conta1.depositar();
		conta1.sacar();
		conta1.transferir(conta2);
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}
