package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
		
		pessoas.add("Wario");

		//ordem alfabetica
		Collections.sort(pessoas);
		
		System.out.println(pessoas);
		
		//mistura elementos
		Collections.shuffle(pessoas);
		
		System.out.println(pessoas);
		
		//reverte a lista
		Collections.reverse(pessoas);
		
		System.out.println(pessoas);
		
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));
		
		HashMap<String, String> capitais = new HashMap();
		capitais.put("Brasil", "Brasília");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assunção");
		capitais.put("Uruguai", "Montevidéu");
		
		System.out.println(capitais);
		System.out.println(capitais.get("Brasil"));
		
		ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> conjunto = new HashSet();
		HashMap<String, Integer> mapa = new HashMap();
		
		int soma;
		soma = 0;
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		
		for (int item : lista) {
			soma += item;
		}
		
		soma = 0;
		//Iterator it = mapa.entrySet().iterator();
		//Iterator it = conjunto.iterator();
		Iterator it = lista.iterator();
		
		while (it.hasNext()) {
			soma += (int) it.next();
		}
		
	}
}
