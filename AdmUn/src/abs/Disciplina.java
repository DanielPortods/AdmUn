package abs;

public class Disciplina {

	private String nome;
	private int codigo;
	private int credito;
	private char tipo;
	
	public Disciplina(String nome, int codigo, int credito, char tipo) {
		this.nome = nome;
		this.codigo = codigo;
		this.credito = credito;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public int getCredito() {
		return this.credito;
	}
	
	public char getTipo() {
		return this.char;
	}

}
