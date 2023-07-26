package exercicio;

public class IngressoVip extends Ingresso {

	public double adicional;
	
	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional + valor;
	}
	
	public void imprimir() {
		System.out.println("Ingresso Vip: " + adicional);
	}
}
