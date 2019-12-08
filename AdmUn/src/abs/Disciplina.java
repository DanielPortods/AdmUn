package abs;

public class Disciplina {

	private String nome;
	private int credito;
	private String categoria;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, int credito, String tipo) {
		this.nome = nome;
		this.credito = credito;
		this.categoria = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCredito() {
		return this.credito;
	}
	
	public String getCat() {
		return this.categoria;
	}

}
