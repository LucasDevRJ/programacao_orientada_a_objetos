package projeto;

public class Carro {
	//atributo static permite o acesso sem instancias
	String nome;
	static String modelo;
	float velocidade;
	
	static float milhasParaMetros(float milhas) {
		return milhas * 1600;
	}
}
