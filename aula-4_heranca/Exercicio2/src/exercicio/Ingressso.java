package exercicio;

public class Ingressso {
	public String nomeEvento;
	public double valor;
	
	public void imprimir() {
		System.out.println("Evento: " + this.nomeEvento);
		System.out.println("Valor: R$ " + this.valor);
	}
}
