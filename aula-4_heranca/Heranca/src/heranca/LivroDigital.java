package heranca;

public class LivroDigital extends Livro {
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigital(String titulo, String autor, String linkDownload) {
		super(titulo, autor);
		this.linkDownload = linkDownload;
	}
	
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	public float tamanhoPorPagina() {
		return tamanhoMB / (float) paginas;
	}
}
