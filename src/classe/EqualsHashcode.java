package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		//Utilizando o Equals e Hashcode
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
