package projeto;

public class Carro {
	//atributo static permite o acesso sem instancias
	
	//final não permite alteração
	static final String nome = "Ford";
	static String modelo;
	float velocidade;
	
	static float milhasParaMetros(float milhas) {
		return milhas * 1600;
	}
}
