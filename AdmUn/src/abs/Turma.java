package abs;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private int qtdMaxAls; //qtd máxima de alunos que essa turma suporta
	private List<Aluno> alsMatriculados = new ArrayList<Aluno>(); //array list dos alunos matriculados nessa turma
	private int qtdAls; //qtd de alunos matriculados nessa turma
	
	private List<Professor> profsMatriculados = new ArrayList<Professor>(); //array list dos professores matriculados nessa turma
	private int qtdProfs; //qtd de professores matriculados nessa turma
	
	private Disciplina discCad; //disciplina cadastrada nessa turma
	
	public Turma(String nome) {
		this.nome = nome;
		this.qtdMaxAls = 0;
		this.qtdAls = 0;
		this.qtdProfs = 0;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setQtdMaxAls(int qtdMaxAls) {
		this.qtdMaxAls = qtdMaxAls;
	}
	
	public int getQtdMaxAls() {
		return this.qtdMaxAls;
	}
	
	public void setQtdAls(int qtdAls) {
		this.qtdAls = qtdAls;
	}
	
	public int getQtdAls() {
		return this.qtdAls;
	}
	
	public void setQtdProfs(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	
	public int getQtdProfs() {
		return this.qtdProfs;
	}
	
	public void cadProf(String nome, int cadastro) {
		Professor professor = new Professor(nome, cadastro);
		profsMatriculados.add(professor);
		qtdProfs++;
	}
	
	public void profCads() {
		int qntProfessoresCadastrados = profsMatriculados.size(); //encontra o tamanho atual do array list dos professores cadastrados nessa instituição
		int i; //contador
				
		for(i = 0; i < qntProfessoresCadastrados; i++) {
			System.out.println(profsMatriculados.get(i).getNome()); //retorna o nome do professor
			System.out.println(profsMatriculados.get(i).getCadastro()); //retorna o cadastro do professor
		}
	}
	
	public void cadAls(String nome, int matricula) {
		Aluno aluno = new Aluno(nome, matricula); //cria um novo objeto da classe Aluno com os parâmetros
		alsMatriculados.add(aluno); //adiciona o novo objeto criado no array list dos alunos cadastrados nessa disciplina
		qtdAls++;
	}
	
	public void alsCads() {
		int qntAlunosCadastrados = alsMatriculados.size(); //encontra o tamanho atual do array list dos alunos
		int i; //contador
				
		for(i = 0; i < qntAlunosCadastrados; i++) {
			System.out.println(alsMatriculados.get(i).getNome()); //retorna o nome do aluno
			System.out.println(alsMatriculados.get(i).getMatricula()); //retorna a matrícula do aluno
		}
	}
	
	public void cadDiscCad(String nome, int codigo, int credito, char tipo) {
		discCad = new Disciplina(nome, codigo, credito, tipo);
	}
	
	public void getDiscCad() {
		System.out.println(discCad.getNome());
		System.out.println(discCad.getCodigo());
		System.out.println(discCad.getCredito());
		System.out.println(discCad.getTipo());
	}

}
