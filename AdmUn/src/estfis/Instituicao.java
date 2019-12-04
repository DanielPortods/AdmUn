package estfis;

import java.util.ArrayList;
import java.util.List;

import usr.Professor;

public class Instituicao extends Estrutura {
		private String uf;
		Campus cp[];
		private List<Professor> profsCadastrados = new ArrayList<Professor>(); //array list dos professores cadastrados nessa instituição
		private List<Aluno> alsCadastrados = new ArrayList<Aluno>(); //array list dos alunos cadastrados nessa disciplina
		
		public Instituicao (String nom, String uf) {
			this.nome = nom;
			this.uf = uf;
			this.formest = "Campus";
		}
		
		//método para cadastro de professores
		public void cadProf(String nome, int cadastro) {
			Professor professor = new Professor(nome, cadastro); //cria um novo objeto da classe Professor com os parâmetros recebidos
			profsCadastrados.add(professor); //adiciona o novo objeto criado no array list dos professores cadastrados nessa disciplina
		}
		
		//método para retornar os professores cadastrados na instituição
		public void profCads() {
			int qntProfessoresCadastrados = profsCadastrados.size(); //encontra o tamanho atual do array list dos professores cadastrados nessa instituição
			int i; //contador
			
			for(i = 0; i < qntProfessoresCadastrados; i++) {
				System.out.println(profsCadastrados.get(i).getNome()); //retorna o nome do professor
				System.out.println(profsCadastrados.get(i).getCadastro()); //retorna o cadastro do professor
			}
		}
		
		//método para cadastrado de alunos
		public void cadAls(String nome, int matricula) {
			Aluno aluno = new Aluno(nome, matricula); //cria um novo objeto da classe Aluno com os parâmetros
			alsCadastrados.add(aluno); //adiciona o novo objeto criado no array list dos alunos cadastrados nessa disciplina
		}
		
		//método para retornar os alunos cadastrados na instituição
		public void alsCads() {
			int qntAlunosCadastrados = alsCadastrados.size(); //encontra o tamanho atual do array list dos professores
			int i; //contador
			
			for(i = 0; i < qntAlunosCadastrados; i++) {
				System.out.println(alsCadastrados.get(i).getNome()); //retorna o nome do aluno
				System.out.println(alsCadsatrados.get(i).getMatricula()); //retorna a matrícula do aluno
			}
		}
}
