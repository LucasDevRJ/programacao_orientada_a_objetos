package exerciciocofrinho;

public class Principal {
	public static void main(String[] args) {
		Moeda real = new Moeda(3.40, "Real");
		Moeda real2 = new Moeda(5.20, "Real");
		Moeda real3 = new Moeda(7.10, "Real");
		
		Cofrinho cofrinho = new Cofrinho();
		cofrinho.adicionar(real);
		cofrinho.adicionar(real2);
		cofrinho.adicionar(real3);
		cofrinho.calcularTotal();
	}
}
