package fundamentos.operadores;

import javax.swing.JOptionPane;

public class Ternario {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String nota = JOptionPane.showInputDialog("Senhor(a) " + nome + " Digite sua nota");
		double media = Double.parseDouble(nota);
		String resultado = media >= 7 ? "Aprovado" : "Reprovado"; // Operador Ternario ">=" "?" ":" 
		boolean a = resultado == "Aprovado";

		if (a == true) {
			System.out.println("Parab�ns " + nome);
			System.out.println("Voc� est� : " + resultado);
			System.out.println("Sua m�dia � :" + media);
		} else {
			resultado = media >= 5 ? "Em Recupera��o" : "Reprovado";
			System.out.println("Senhor(a) " + nome);
			System.out.println("Voc� est� :" + resultado);
			System.out.println("Sua m�dia � : " + media);
		}
	}
}