package exercicio;

public class LivroFisico extends Livro {
	private int tiragem;
	private int peso;
	
	public LivroFisico(String titulo, Autor autor, String genero, String edicao) {
		super(titulo, autor, genero, edicao);
		// TODO Auto-generated constructor stub
	}
	
	public int getTiragem() {
		return tiragem;
	}
	
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
