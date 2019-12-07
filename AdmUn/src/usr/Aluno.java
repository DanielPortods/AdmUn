package usr;

public class Aluno {
	String nome;
	int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
}
