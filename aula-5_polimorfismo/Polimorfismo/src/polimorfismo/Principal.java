package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Assalariado("Rodolfo", 3200.00f);
		
		System.out.println(funcionario1.nome);
		
		funcionario1 = new Horista("Júnior", 8, 35.00f);
		
		Funcionario funcionarios[] = {
				new Assalariado("Fábio", 4500.00f),
				new Horista("Mário", 125, 28.00f),
				new Comissionado("Daniel", 140, 20.00f)
		};
		
		System.out.println();
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Nome: " + funcionarios[i].nome);
			System.out.println("Salário: " + funcionarios[i].pagamento());
			System.out.println();
		}
		
		Gato gato = new Gato();
		gato.emitirSom();
		gato.dormir();
		
		Roupa roupa = new Roupa("Camisa", Tamanho.M, Estacao.OUTONO);
	}
}
