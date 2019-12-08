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
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	public int getCredito() {
		return this.credito;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return this.tipo;
	}

}
