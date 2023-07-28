package exercicios;

public class Principal {
	public static void main(String[] args) {
		Desktop desktop = new Desktop(1000, 1, 3);
		double valorTotal = desktop.calculaValor();
		System.out.println(valorTotal);
		desktop.imprimir();
		
		Notebook notebook = new Notebook(500, 1, 26);
		double valorTotal2 = notebook.calculaValor();
		System.out.println(valorTotal2);
		notebook.imprimir();
	}
}
