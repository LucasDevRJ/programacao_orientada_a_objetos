package exercicio;

public class Principal {
	public static void main(String[] args) {
		Autor autor = new Autor("Aditya Bhargava", "adityabhargava@gmail.com", "indiano");
		Livro livro = new Livro("Entendendo Algoritmos", autor, "Programação", "Português");
		LivroFisico livroFisico = new LivroFisico("Entendendo Algoritmos", autor, "Programação", "Português", 10000, 50);
		LivroDigital livroDigital = new LivroDigital("Entendendo Algoritmos", autor, "Programação", "Português", 20000, 12482);
		
		System.out.println(livro);
		System.out.println();
		System.out.println(livroFisico);
		System.out.println();
		System.out.println(livroDigital);
	}
}
