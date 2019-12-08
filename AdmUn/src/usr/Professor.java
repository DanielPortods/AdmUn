package usr;

public class Professor {
	String nome;
	int cadastro;
	
	public Professor(String nome, int cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	
	public int getCadastro() {
		return this.cadastro;
	}

}
