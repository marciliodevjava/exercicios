package fundamentos.operadores;

public class AtribuicaoParoOuImpar {

	public static void main(String[] args) {

		int a = 3; // vari�vel.
		int b = a; // atribui��o.
		int c = a + b; // com 2 operandor.

		c += b; // c = c + b //Atribui��o Aditiva.
		c -= a; // c = c -a //Atribui��o subtrativa.
		c *= b; // c = c * b //Atribui��o multiplicativa.
		c /= a; // c = c / a //Atribui��o divisiva.
		c ++; // Operador un�rio de emcremento.
		c --; // Operador un�rio de decremento.

		System.out.println(c);

		c %= 2; // c = c % 2 Resultado 0 "par" ou 1 "�mpar" utiliza-se para para saber par ou �mpar.
				// Atribui��o modulo.

		System.out.println(c);

	}
}
