package exercicio;

public class Ingresso {
	
	public String nomeEvento;
	public double valor;
	
	public Ingresso(String nomeEvento, double valor) {
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}
	
	public void imprimir() {
		System.out.println("Evento: " + this.nomeEvento);
		System.out.println("Valor: R$ " + this.valor);
	}
	
	public void imprimirIngressoVip() {
		IngressoVip ingressoVip = new IngressoVip("Show do Supercombo", 25.00, 8.00);
		ingressoVip.imprimir();
	}
}
