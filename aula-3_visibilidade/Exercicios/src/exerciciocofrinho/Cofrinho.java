package exerciciocofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> moedas = new ArrayList();
	private double valorTotalMoedas = 0;
	
	public Cofrinho() {
		
	}
	
	public void adicionar(Moeda moeda) {
		this.moedas.add(moeda);
	}
	
	public void calcularTotal() {
		for (Moeda moeda : moedas) {
			this.valorTotalMoedas += moeda.getValor();
		}
		System.out.printf("O valor total de moedas é %.2f", this.valorTotalMoedas);
	}
}
