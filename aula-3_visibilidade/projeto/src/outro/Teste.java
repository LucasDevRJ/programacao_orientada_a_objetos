package outro;

//importanto, pois não estão no mesmo pacote
import projeto.Aluno;

public class Teste {

	public static void teste() {
		Aluno a = new Aluno(1001, "Lucas Pereira", "111.222.333-44");
		a.info();
	}
}
