package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Infome a m�dia");
		String media = entrada.next();
		Double media1 = Double.parseDouble(media);

		if (media1 > 10) {
			System.out.println("N�mero de m�dia errado!");
		}
		if (media1 >= 7.0 && media1 <= 10) {
			System.out.println("Aprovado: " + media1);
		}
		if (media1 >= 4.0 && media1 < 7.0) {
			System.out.println("Recupera��o: " + media1);
		}
		if (media1 >= 0 && media1 < 4.0) {
			System.out.println("Reprovado: " + media1);
		}
		entrada.close();
	}
}
