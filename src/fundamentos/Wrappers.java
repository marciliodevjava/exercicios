package fundamentos;

import java.util.Scanner;

public class Wrappers {
	/*
	 * / Wrapper s�o os metodos primitivos ou metodo "."
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero Byte: ");
		Byte b = Byte.parseByte(entrada.next());
		System.out.println("Digite um n�mero ate Short: ");
		Short s = Short.parseShort(entrada.next());
		System.out.println("Digite um n�mero Int");
		Integer i = Integer.parseInt(entrada.next()); // int
		System.out.println("Digite um n�mero Long");
		Long l = Long.parseLong(entrada.next());
		System.out.println("Digite um n�mero Float: ");
		Float f = Float.parseFloat(entrada.next());
		System.out.println("Digite um n�mero Double: ");
		Double d = Double.parseDouble(entrada.next());

		System.out.printf("N�mero Byte: " + b.byteValue());
		System.out.printf("\nN�mero Short: " + s.shortValue());
		System.out.printf("\nN�mero Int: " + i.intValue());
		System.out.printf("\nN�mero Long: " + l.longValue());
		System.out.printf("\nN�mero Float: " + f.floatValue());
		System.out.printf("\nN�mero Double: " + d.doubleValue());

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println("\nBooelean: " + bo);
		System.out.println(bo.toString().toUpperCase());

		Character c = '#'; // char
		System.out.println("Char: " + c.charValue());

		entrada.close();
	}
}
