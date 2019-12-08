package usr;

public class Professor {
	String nome; 
	int cadastro;
	
	public Professor() {
		
	}
	
	public Professor(String nome, int cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}
	
	public String getnome() {
		return this.nome;
	}
	
	public int getCadastro() {
		return this.cadastro;
	}

}
