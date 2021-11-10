package entidades;

public class Renda {
	private String nome;
	private String email;
	
	public Renda(String name, String email) {
	this.nome = name;
	this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
	return nome + ", " + email;
	}
	
	


}
