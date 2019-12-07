package abs;

public class Disciplina {

	private String nome;
	private int credito;
	private String tipo;
	
	public Disciplina(String nome, int credito, String tipo) {
		this.nome = nome;
		this.credito = credito;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCredito() {
		return this.credito;
	}
	
	public String getTipo() {
		return this.tipo;
	}

}
