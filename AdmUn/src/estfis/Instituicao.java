package estfis;

import java.util.ArrayList;
import java.util.List;

import usr.Professor;

public class Instituicao extends Estrutura {
		private String uf;
		Campus cp[];
		private List<Professor> profsCadastrados = new ArrayList<Professor>(); //array list dos professores cadastrados nessa instituição
		
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
		
		//método para retornar os professores cadastrados na instituição;
		public void profCads() {
			int qntProfessoresCadastrados = profsCadastrados.size(); //encontra o tamanho atual do array list dos professores cadastrados nessa instituição
			int i; //contados
			
			for(i = 0; i < qntProfessoresCadastrados; i++) {
				System.out.println(profsCadastrados.get(i).getNome()); //retorna o nome do professor
				System.out.println(profsCadastrados.get(i).getCadastro()); //retorna o cadastro do professor
			}
		}
}
