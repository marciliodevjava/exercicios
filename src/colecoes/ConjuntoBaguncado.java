package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//double --> Double (wrapper)
		conjunto.add(true);// boolean --> Boolean (wrapper)
		conjunto.add("Teste");// String
		conjunto.add(1);//int --> Integer (wrapper)
		conjunto.add('x');// char --> Caracterer (wrapper)
		
	}
}
