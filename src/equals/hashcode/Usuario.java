package equals.hashcode;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			return super.equals(objeto);
		}
		return false;
	}
}
