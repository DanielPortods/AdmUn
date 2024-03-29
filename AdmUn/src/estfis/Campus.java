package estfis;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import excecoes.*;
import abs.*;
import gui.Menus;
import principal.Main;
import usr.*;


public class Campus extends Estrutura {
	String cidade;
	String indice;
	ArrayList<Predio> prd = new ArrayList<>();
	ArrayList<Turma> turmas = new ArrayList<>();
	
	public Campus (String nome, String cd, String ind) {
		this.nome = nome;
		this.cidade = cd;
		this.indice=ind;
		this.formest = "Prédios";
	}
	
	public ArrayList<? extends Estrutura> getEst(){
		return this.prd;
	}
	
	protected void caNew() throws CampoEmBrancoException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, OpcaoInvalidaException, IOException {
		ArrayList<String> pal = new ArrayList<>();
		pal.add("Nome");
		pal.add("Andares");
		prd.add((Predio) Menus.caNew(2, pal, "P"));
	}

	protected void opt() throws DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, CampoEmBrancoException, TipoDeAulaNaoAtribuidoException, IOException, NumberFormatException {
		while (true) {
			try {
				System.out.println("--------------- Opções ---------------");
				System.out.println("[1] Detalhes");
				System.out.println("[2] Turmas");
				System.out.println("[<] Voltar");
				String res = Menus.entrada();
				if(res.equals("1")) {
					det();
				} else if(res.equals("2")) {
					while(true) {
						Menus.menu("Turmas", turmas, this.nome);
						String res2 = Menus.entrada();
						if(res2.equals("<")) {
							break;
						} else if(res2.equals("+")) {
							ArrayList<String> pal = new ArrayList<>();
							pal.add("Disciplina");
							pal.add("Nome professor");
							pal.add("Código da turma");
							pal.add(this.indice);
							try {
								turmas.add((Turma) Menus.caNew(3, pal, "T"));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else if(res2.equals("-")) {
							Menus.del(turmas, "turma");
						} else {
							int id = Integer.parseInt(res2);
							turmas.get(id - 1).home(this.prd);
						}
					}
				} else if(res.equals("<")) {
					break;
				} else {
					throw new OpcaoInvalidaException(0, 1);
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
			}
		}
	}

	protected void det() throws IOException, HeadlessException {
		while (true) {
			System.out.println("--------------- Detalhes ---------------");
			System.out.println("Nome: " + this.nome);
			System.out.println("Cidade: " + this.cidade);
			System.out.println("Quantidade de turmas: " + turmas.size());
			System.out.print("\n[<] Voltar [1] Mudar nome [2] Mudar uf");
			String res = Menus.entrada();

			if (res.equals("<")) {
				break;
			} else if (res.equals("1")) {
				String nome;
				while (true) {
					try {
						try {
							nome = JOptionPane.showInputDialog("Nome:");
							if (nome == null) {
								break;
							} else if (nome.trim().length() == 0) {
								throw new CampoEmBrancoException("o nome do campus");
							} else {
								changename(nome);
								break;
							}
						} catch (CampoEmBrancoException e) {
							e.msg();
							continue;
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else if (res.equals("2")) {
				String cidade;
				while (true) {
					try {
						try {
							cidade = JOptionPane.showInputDialog("UF:");
							if (cidade == null) {
								break;
							} else if (cidade.trim().length() == 0) {
								throw new CampoEmBrancoException("a cidade do campus");
							} else {
								changeCity(cidade);
								break;
							}
						} catch (CampoEmBrancoException e) {
							e.msg();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void changeCity(String ct) {
		this.cidade=ct;
	}

	@Override
	public int home(String cat, int qtaulas) throws CampoEmBrancoException {
		// TODO Auto-generated method stub
		return 0;
	}
}
