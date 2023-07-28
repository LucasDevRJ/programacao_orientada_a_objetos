package exercicios;

public class Notebook extends Computador {
	
	private int polegadas;
	
	public int getPolegadas() {
		return polegadas;
	}

	public Notebook(int gigabytes, int quantidadeProcessadores, int polegadas) {
		super(gigabytes, quantidadeProcessadores);
		this.polegadas = polegadas;
	}

	@Override
	public double calculaValor() {
		return super.getGigabytes() * 250 + 
				getQuantidadeProcessadores() * 500 + 
				this.polegadas * 100;
	}

	@Override
	public void imprimir() {
		System.out.println("Gigabytes: " + super.getGigabytes());
		System.out.println("Quantidade de Processadores: " + super.getQuantidadeProcessadores());
		System.out.println("Polegadas: " + this.polegadas);
	}

}
