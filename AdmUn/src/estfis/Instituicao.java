package estfis;
import usr.*;
import abs.Disciplina;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import usr.Professor;
import excecoes.*;
import gui.Menus;
import principal.Main;

public class Instituicao extends Estrutura {
	private String uf;
	private ArrayList<Campus> cp = new ArrayList<>();
	private ArrayList<Professor> profsCadastrados = new ArrayList<Professor>(); // array list dos professores																			
	private ArrayList<Aluno> alsCadastrados = new ArrayList<Aluno>(); // array list dos alunos cadastrados nessa																	
	private ArrayList<Disciplina> discCadastradas = new ArrayList<Disciplina>(); // array list das disciplinas
																					

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
	
	public ArrayList<Campus> getEst() {
		return this.cp;
	}

	protected void caNew() throws CampoEmBrancoException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, OpcaoInvalidaException {
		ArrayList<String> pal = new ArrayList<>();
		pal.add("Nome");
		pal.add("Cidade");
		pal.add(Integer.toString(findself()));
		cp.add((Campus) Menus.caNew(2, pal, "C"));
	}

	protected void opt() throws DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, CampoEmBrancoException, TipoDeAulaNaoAtribuidoException {

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
						if(res2.equals("<")) {
							break;
						} else if(res2.equals("+")) {
							ArrayList<String> pal = new ArrayList<>();
							pal.add("Nome");
							pal.add("Cadastro");
							profsCadastrados.add((Professor) Menus.caNew(2, pal, "Pr"));
						} else if(res2.equals("-")) {
							Menus.del(profsCadastrados, "professor");
						} else {
							// turmas do professor se der tempo
						}
					}
				} else if(res.equals("3")) {
					while(true) {
						Menus.menu("Alunos", alsCadastrados, this.nome);
						String res2 = Menus.entrada();
						if(res2.equals("<")) {
							break;
						} else if(res2.equals("+")) {
							ArrayList<String> pal = new ArrayList<>();
							pal.add("Nome");
							pal.add("Matrícula");
							alsCadastrados.add((Aluno) Menus.caNew(2, pal, "A"));
						} else if(res2.equals("-")) {
							Menus.del(alsCadastrados, "aluno");
						} else {
							// turmas do aluno se der tempo
						}
					}
				} else if(res.equals("4")) {
					while(true) {
						Menus.menu("Disciplinas", discCadastradas, this.nome);
						String res2 = Menus.entrada();
						if(res2.equals("<")) {
							break;
						} else if(res2.equals("+")) {
							ArrayList<String> pal = new ArrayList<>();
							pal.add("Nome");
							pal.add("Créditos");
							pal.add("Categoria");
							discCadastradas.add((Disciplina) Menus.caNew(3, pal, "D"));
						} else if(res2.equals("-")) {
							Menus.del(discCadastradas, "disciplina");
						} else {
							//quantidade de turmas da disciplina se der tempo
						}
					}
					
				} else if(res.equals("<")) {
					break;
				} else {
					throw new OpcaoInvalidaException(1);
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
			}
		}
	}	
	
	private void changeUf(String uf) {
		this.uf = uf;
	}

	public ArrayList<Professor> getProfsCadastrados() {
		return profsCadastrados;
	}

	public ArrayList<Aluno> getAlsCadastrados() {
		return alsCadastrados;
	}

	public ArrayList<Disciplina> getDiscCadastradas() {
		return discCadastradas;
	}	

	private int findself() {
		for (int i = 0; i<Main.getInst().size(); i++) {
			if (Main.getInst().get(i).getnome().equals(this.nome)) {
				return i;
			}
		}
	return -1;
	}
}