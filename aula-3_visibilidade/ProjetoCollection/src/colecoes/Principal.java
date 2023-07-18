package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Principal {
	public static void main(String[] args) {
		//ArrayList<String> pessoas = new ArrayList();
		LinkedList<String> pessoas = new LinkedList();
		
		//como ambos heram de listas
		//possuem muitas semelhanças
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas);
		
		System.out.println(pessoas.get(0));
		
		pessoas.remove(2);
		
		System.out.println(pessoas);
		
		HashMap<String, String> capitais = new HashMap();
		capitais.put("Brasil", "Brasília");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assunção");
		capitais.put("Uruguai", "Montevidéu");
		
		System.out.println(capitais);
		System.out.println(capitais.get("Brasil"));
	}
}
