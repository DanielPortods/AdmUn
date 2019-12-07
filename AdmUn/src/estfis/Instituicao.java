package estfis;
import usr.*;
import abs.Disciplina;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import usr.Professor;
import excecoes.*;
import gui.Menus;

public class Instituicao extends Estrutura {
	private String uf;
	private ArrayList<Campus> cp = new ArrayList<>();
	private ArrayList<Professor> profsCadastrados = new ArrayList<Professor>(); // array list dos professores
																				// cadastrados nessa instituição
	private ArrayList<Aluno> alsCadastrados = new ArrayList<Aluno>(); // array list dos alunos cadastrados nessa
																		// instiuição
	private ArrayList<Disciplina> discCadastradas = new ArrayList<Disciplina>(); // array list das disciplinas
																					// cadastradas nessa instituição

	public Instituicao(String nome, String uf) {
		this.nome = nome;
		this.uf = uf;
		this.formest = "Campus";
	}

	protected void det() {
		while (true) {
			System.out.println("--------------- Detalhes ---------------");
			System.out.println("Nome: " + this.nome);
			System.out.println("Uf: " + this.uf);
			System.out.println("Alunos matriculados: " + alsCadastrados.size());
			System.out.println("Professores cadastrados: " + profsCadastrados.size());
			System.out.println("Quantidade de disciplinas: " + discCadastradas.size());
			System.out.print("\n[<] Voltar [1] Mudar nome [2] Mudar uf");
			String res = Menus.entrada();

			if (res.equals("<")) {
				break;
			} else if (res.equals("1")) {
				String nome;
				while (true) {
					try {
						nome = JOptionPane.showInputDialog("Nome:");
						if (nome == null) {
							break;
						} else if (nome.trim().length() == 0) {
							throw new CampoEmBrancoException("o nome da instituição");
						} else {
							changename(nome);
							break;
						}
					} catch (CampoEmBrancoException e) {
						e.msg();
						continue;
					}
				}
			} else if (res.equals("2")) {
				String uf;
				while (true) {
					try {
						uf = JOptionPane.showInputDialog("UF:");
						if (uf == null) {
							break;
						} else if (uf.trim().length() == 0) {
							throw new CampoEmBrancoException("a UF da instituição");
						} else {
							changeUf(uf);
							break;
						}
					} catch (CampoEmBrancoException e) {
						e.msg();
					}
				}
			}
		}
	}
	
	public ArrayList<? extends Estrutura> getEst() {
		return this.cp;
	}

	protected void caNew() throws CampoEmBrancoException {
		String nome = null;
		String cidade = null;

		while (true) {
			try {
				nome = JOptionPane.showInputDialog("Nome:");
				if (nome == null) {
					return;
				} else if (nome.trim().length() == 0) {
					throw new CampoEmBrancoException("o nome do campus");
				} else {
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			}
		}

		while (true) {
			try {
				cidade = JOptionPane.showInputDialog("Cidade:");
				if (cidade == null) {
					return;
				} else if (uf.trim().length() == 0) {
					throw new CampoEmBrancoException("a cidade do campus " + nome);
				} else {
					Campus i = new Campus(nome, cidade);
					cp.add(i);
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
			}
		}
	}

	protected void opt() {

		while (true) {
			try {
				System.out.println("--------------- Opções ---------------");
				System.out.println("[1] Detalhes");
				System.out.println("[2] Professores");
				System.out.println("[3] Alunos");
				System.out.println("[4] Disciplinas");
				System.out.println("[<] Voltar");
				String res = Menus.entrada();
				if(res.equals("1")) {
					det();
				} else if(res.equals("2")) {
					while(true) {
						Menus.menu("Professores", profsCadastrados, this.nome);
						String res2 = Menus.entrada();
					}
				} else if(res.equals("3")) {
					while(true) {
						Menus.menu("Alunos", alsCadastrados, this.nome);
						String res2 = Menus.entrada();
					}
				} else if(res.equals("4")) {
					while(true) {
						Menus.menu("Disciplinas", discCadastradas, this.nome);
						String res2 = Menus.entrada();
					}
					
				} else if(res.equals("<")) {
					break;
				} else {
					throw new OpcaoInvalidaException();
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
			}
		}
	}

	// método para cadastro de professores
	public void cadProf(String nome, int cadastro) {
		Professor professor = new Professor(nome, cadastro); // cria um novo objeto da classe Professor com os
																// parâmetros recebidos
		profsCadastrados.add(professor); // adiciona o novo objeto criado no array list dos professores cadastrados
											// nessa disciplina
	}

	// método para retornar os professores cadastrados na instituição
	public void profCads() {
		int qntProfessoresCadastrados = profsCadastrados.size(); // encontra o tamanho atual do array list dos
																	// professores cadastrados nessa instituição
		int i; // contador

		for (i = 0; i < qntProfessoresCadastrados; i++) {
			System.out.println(profsCadastrados.get(i).getNome()); // retorna o nome do professor
			System.out.println(profsCadastrados.get(i).getCadastro()); // retorna o cadastro do professor
		}
	}

	// método para cadastro de alunos
	public void cadAls(String nome, int matricula) {
		Aluno aluno = new Aluno(nome, matricula); // cria um novo objeto da classe Aluno com os parâmetros
		alsCadastrados.add(aluno); // adiciona o novo objeto criado no array list dos alunos cadastrados nessa
									// disciplina
	}

	// método para retornar os alunos cadastrados na instituição
	public void alsCads() {
		int qntAlunosCadastrados = alsCadastrados.size(); // encontra o tamanho atual do array list dos alunos
		int i; // contador

		for (i = 0; i < qntAlunosCadastrados; i++) {
			System.out.println(alsCadastrados.get(i).getNome()); // retorna o nome do aluno
			System.out.println(alsCadastrados.get(i).getMatricula()); // retorna a matrícula do aluno
		}
	}

	// método para cadastro de disciplinas
	/*public void cadDisc(String nome, int codigo, int credito, char tipo) {
		Disciplina disciplina = new Disciplina(nome, codigo, credito, tipo);
		discCadastradas.add(disciplina);
	}*/

	// método para retornar as disciplinas cadastradas na instituição
	public void discCadas() {
		int qntDisciplinasCadastradas = discCadastradas.size(); // encontra o tamnho atual do array list das disciplinas
		int i;

		for (i = 0; i < qntDisciplinasCadastradas; i++) {
			System.out.println(discCadastradas.get(i).getNome());
			//System.out.println(discCadastradas.get(i).getCodigo());
			System.out.println(discCadastradas.get(i).getCredito());
			System.out.println(discCadastradas.get(i).getTipo());
		}
	}
	
	private void changeUf(String uf) {
		this.uf = uf;
	}
}