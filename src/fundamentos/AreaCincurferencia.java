package fundamentos;

public class AreaCincurferencia {

	public static void main(String[] args) {

		// numero tipo flutuante 0.0
		double raio = 3.4;
		// numero PI 3.14
		// quando se coloca "final" a variavel se torna variavel constante;
		final double PI = 3.14159;

		double area = PI * raio * raio;
		System.out.println("Area �: " + area + "m2");

		raio = 10;
		area = PI * 10 * 10;

		System.out.println("Ar�a �: " + area + "m2");

	}
}
