package exercicios;

public class Desktop extends Computador {
	
	private double acessorios;

	public Desktop(int gigabytes, int quantidadeProcessadores, double acessorios) {
		super(gigabytes, quantidadeProcessadores);
		this.acessorios = acessorios;
	}
	
	public double getAcessorios() {
		return acessorios;
	}

	@Override
	public double calculaValor() {
		// TODO Auto-generated method stub
		return super.getGigabytes() * 200 + 
				super.getQuantidadeProcessadores() * 400 + 
				this.acessorios;
	}

	@Override
	public void imprimir() {
		System.out.println("Gigabytes: " + super.getGigabytes());
		System.out.println("Quantidade de Processadores: " + super.getQuantidadeProcessadores());
		System.out.println("Quantidade de Acessórios: " + this.acessorios);
	}
}
