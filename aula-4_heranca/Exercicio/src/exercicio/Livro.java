package exercicio;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private String edicao;
	
	public Livro(String titulo, Autor autor, String genero, String edicao) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setGenero(genero);
		this.setEdicao(edicao);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		return "Informações do Livro\nNome: " + this.titulo +
				"\nAutor: " + this.autor.getNome() + "\nGenero: " + this.genero +
				"\nEdição: " + this.edicao;
	}
}
