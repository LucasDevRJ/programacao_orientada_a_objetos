package heranca;

public class Principal {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Código limpo", "Robert C. Martin");
		livro1.custoProducao = 2.00f;
		livro1.precoVenda = 89.90f;
		livro1.paginas = 425;
		
		livro1.imprimirLivro();
		System.out.println("Lucro: R$ " + livro1.lucro());
		System.out.println("Imposto: R$ " + livro1.imposto());
		
		LivroDigital livroDigital1 = new LivroDigital("Código limpo", "Robert C. Martin", "https://www.amazon.com.br/C%C3%B3digo-Limpo-Robert-C-Martin-ebook/dp/B085Q2K632/ref=tmm_kin_swatch_0?_encoding=UTF8&qid=&sr=#detailBullets_feature_div");
		livroDigital1.custoProducao = 12.00f;
		livroDigital1.precoVenda = 85.40f;
		livroDigital1.tamanhoMB = 27;
		
		System.out.println("Imposto: R$ " + livroDigital1.imposto());
		livroDigital1.imprimirLivro();
		System.out.println("Lucro: R$ " + livroDigital1.lucro());
		System.out.println("Tamanho por página: " + livroDigital1.tamanhoPorPagina());;
	}
}
