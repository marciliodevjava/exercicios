package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// double --> Double (wrapper)
		conjunto.add(true);// boolean --> Boolean (wrapper)
		conjunto.add("Teste");// String
		conjunto.add(1);// int --> Integer (wrapper)
		conjunto.add('x');// char --> Caracterer (wrapper)

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste");
		System.out.println(conjunto.size());

		conjunto.remove("Teste");
		System.out.println("Tamanho" + conjunto.size());

		System.out.println(conjunto.contains(1.2));

		HashSet nums = new HashSet();
	}
}
