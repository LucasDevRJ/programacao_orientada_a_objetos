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
		return 0;
	}

}
