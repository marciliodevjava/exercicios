package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rio

		// Tipos n�mero inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_147_399_999L;// "_" � = a "."

		// Tipos num�ricos reais
		float salario = 11_445.44F;// "_" � = a "."
		double vendasAcumuladas = 2_991_797_103.01;// "_" � = a "."

		// Tipo booleano false ou true
		boolean estaDeFerias = false;

		// tipos caracteres char aceit somente 1 n�mero
		char status = 'A';

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365 + " dias.");
		// N�mero de viagens
		System.out.println("Realizou: " + numeroDeVoos / 2 + " voos");
		// Pontos por real
		System.out.println("Para cada real voc� ganhou: " + pontosAcumulados / vendasAcumuladas + " pontos.");
		// id ganha de salario
		System.out.println("Funcion�rio id: " + id + " ganha R$ " + salario);
		// est� de ferias
		System.out.println("Funcionario est� de f�rias: " + estaDeFerias);
		// Status
		System.out.println("Status: " + status);

	}
}
