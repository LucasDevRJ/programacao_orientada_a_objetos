package exercicio;

public class LivroDigital extends Livro {
	private int download;
	private int tamanho;
	
	public LivroDigital(String titulo, Autor autor, String genero, int edicao, int download, int tamanho) {
		super(titulo, autor, genero, edicao);
		this.setDownload(download);
		this.setTamanho(tamanho);
	}
	
	public int getDownload() {
		return download;
	}
	
	public void setDownload(int download) {
		this.download = download;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDownload: " + this.download +
				"\nTamanho: " + this.tamanho;
	}
}
