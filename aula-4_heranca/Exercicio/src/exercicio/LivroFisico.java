package exercicio;

public class LivroFisico extends Livro {
	private int tiragem;
	private int peso;
	
	public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso) {
		super(titulo, autor, genero, edicao);
		this.setTiragem(tiragem);
		this.setPeso(peso);
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
	
	@Override
	public String toString() {
		return super.toString() + "\nTiragem: " + this.tiragem +
				"\nPeso: " + this.peso;
	}
}
