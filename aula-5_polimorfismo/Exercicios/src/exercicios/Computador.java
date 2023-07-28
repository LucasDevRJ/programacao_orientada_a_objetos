package exercicios;

public abstract class Computador {
	
	private int gigabytes;
	private int quantidadeProcessadores;
	
	public Computador(int gigabytes, int quantidadeProcessadores) {
		this.gigabytes = gigabytes;
		this.quantidadeProcessadores = quantidadeProcessadores;
	}
	
	public int getGigabytes() {
		return gigabytes;
	}
	
	public int getQuantidadeProcessadores() {
		return quantidadeProcessadores;
	}
	
	public abstract double calculaValor();
}
