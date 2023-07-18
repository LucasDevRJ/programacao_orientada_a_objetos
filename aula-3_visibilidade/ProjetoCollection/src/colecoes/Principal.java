package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {
	public static void main(String[] args) {
		//ArrayList<String> pessoas = new ArrayList();
		LinkedList<String> pessoas = new LinkedList();
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas);
		
		System.out.println(pessoas.get(0));
		
		pessoas.remove(2);
		
		System.out.println(pessoas);
	}
}
