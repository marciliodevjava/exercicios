package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if(...) = true ou False {}
		// while(...) senten�a; ou {}
		// for(....)1 inciliza��o; 2 expressao; 3 decremento ou incremento; {}
		// do senten�a; ou {....} while(...) termina com ;

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas");
			System.out.print("Quer sair: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! Voc� saiu");
		
		entrada.close();

	}
}
