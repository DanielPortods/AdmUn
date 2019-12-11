package gui;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import abs.*;
import estfis.*;
import excecoes.*;
import principal.Main;
import usr.*;

public class Menus {
	
	public static void enter() {
		System.out.println("--------------- AdmUn ---------------");
		System.out.println("Bem vindo ao gerenciador de universidades");
		System.out.println("          [1] Entrar");
		System.out.println("          [2] Fechar");
	}
	
	public static void menu(String tp, ArrayList<? extends Object> o, String nom) {
		System.out.println("--------------- " + nom + " ---------------");
		System.out.println("  " + tp + ":");
		
		if(tp.equals("Professores")) {
			for(int i=0; i<o.size(); i++) {
				if(((Professor) o.get(i)) != null) {
					System.out.println("[" + (i+1) + "] " + ((Professor) o.get(i)).getnome() + " - " + ((Professor) o.get(i)).getCadastro());
				}else {
					o.remove(i);
				}
			}
		}else if(tp.equals("Alunos")) {
			for(int i=0; i<o.size(); i++) {
				if(((Aluno) o.get(i)) != null) {
					System.out.println("[" + (i+1) + "] " + ((Aluno) o.get(i)).getnome() + " - " + ((Aluno) o.get(i)).getMatricula());
				}else {
					o.remove(i);
				}
			}
		}else if(tp.equals("Turmas")) {
			for(int i=0; i<o.size(); i++) {
				if(((Turma) o.get(i)) != null) {
					System.out.println("[" + (i+1) + "] " + ((Turma) o.get(i)).getdisc().getNome() + " - " + ((Turma) o.get(i)).getcod());
				}else {
					o.remove(i);
				}
			}
		}else if(tp.equals("Disciplinas")) {
			for(int i=0; i<o.size(); i++) {
				if(((Disciplina) o.get(i)) != null) {
					System.out.println("[" + (i+1) + "] " + ((Disciplina) o.get(i)).getNome());
				}else {
					o.remove(i);
				}
			}
		} else if(tp.equals("Salas")) {
			for(int i=0; i<o.size(); i++) {
				if(((Sala) o.get(i)) != null) {
					System.out.println("[" + (i+1) + "] " + ((Sala) o.get(i)).getnome() + " - " + ((Sala) o.get(i)).gettp());
				}else {
					o.remove(i);
				}
			}
		} else {
			for (int i = 0; i < o.size(); i++) {
				if(((Estrutura) o.get(i)) != null) {
					System.out.println("[" + (i + 1) + "] " + ((Estrutura) o.get(i)).getnome());
				} else {
					o.remove(i);
				}
			}	
		}
		
		System.out.println("\nQuantidade de " + tp + ": " + o.size());
		System.out.print("[+] Cadastrar " + tp + " [-] Excluir " + tp + "\n[<] Voltar");
	}
	
	public static String entrada() {
		System.out.println();
		Scanner sc = new Scanner(System.in);		
		String r = sc.next();
		
		if(r.equalsIgnoreCase("exit")) {
			System.exit(0);
		}
		return r;
	}
	
	public static void del(ArrayList<? extends Object> lst, String tp) {
		while (true) {
			try {
				String ids = JOptionPane.showInputDialog("Informe o número de qual " + tp + " deseja excluir:");
				if (ids == null) {
					break;
				} else {
					int id = Integer.parseInt(ids);
					lst.remove(id - 1);
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, tp + " inexistente");
				continue;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe a posição na sua lista");
				continue;
			}
		}
	}
	
	public static Object caNew(int qt, ArrayList<String> pal, String T) throws DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, CampoEmBrancoException, 
																	           TipoDeAulaNaoAtribuidoException, OpcaoInvalidaException, IOException {
		String[] dados = new String[qt];
		Professor pro = null;
		Disciplina dic= null;
		for (int i = 0; i < qt; i++) {
			try {
				dados[i] = JOptionPane.showInputDialog(pal.get(i) + ":");
				if (dados[i] == null) {
					break;
				} else if (dados[i].trim().length() == 0) {
					if (T.equals("C")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						} else if (i == 1) {
							throw new CampoEmBrancoException("a " + pal.get(i));
						}
					} else if (T.equals("P")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						} else if (i == 1) {
							throw new CampoEmBrancoException("a quantidade de " + pal.get(i));
						}
					} else if (T.equals("SA") || T.equals("SL") || T.equals("SC")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));							
						} else if (i == 1) {
							throw new CampoEmBrancoException("a " + pal.get(i));
						}  else if (i == 2) {
							throw new TipoDeAulaNaoAtribuidoException();
						}

					} else if (T.equals("D")) {
						if(i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						}else if(i == 1) {
							throw new CampoEmBrancoException("a quantidade de " + pal.get(i));
						}else if(i == 2) {
							throw new CampoEmBrancoException("a " + pal.get(i));
						}
					} else if (T.equals("Pr")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						} else if (i == 1) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						}
					} else if (T.equals("T")) {
						if (i == 0) {
							throw new DisciplinaNaoInformadaException();
						} else if (i == 1) {
							throw new ProfessorNaoAtribuidoException();
						} else if (i == 2) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						}
					} else if (T.equals("A")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						} else if (i == 1) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						}
					} else if (T.equals("I")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal.get(i));
						} else if (i == 1) {
							throw new CampoEmBrancoException("a " + pal.get(i));
						}
					}
				} else if (i==1 && T.equals("T")) {
					if(veripr(dados[1], Integer.parseInt(pal.get(3)))==null) {
						throw new OpcaoInvalidaException(0, 3);
					}else {
						pro = veripr(dados[1], Integer.parseInt(pal.get(3)));
					}
				} else if (i==0 && T.equals("T")) {
					if(veridic(dados[0], Integer.parseInt(pal.get(3)))==null) {
						throw new OpcaoInvalidaException(0, 4);
					}else {
						dic = veridic(dados[0], Integer.parseInt(pal.get(3)));
					}
				} else if (i == qt - 1) {
					if (T.equals("C")) {
						Campus c = new Campus(dados[0], dados[1], pal.get(2));
						return c;
					} else if (T.equals("P")) {
						Predio p = new Predio(dados[0], Integer.parseInt(dados[1]));
						return p;
					} else if (T.equals("SA")) {
						if (veriCat(dados[2], "S")) {
							Auditorio sa = new Auditorio(dados[0], Integer.parseInt(dados[1]), dados[2], pal.get(3), Integer.parseInt(pal.get(4)));
							return sa;
						} else {
							throw new OpcaoInvalidaException(0, 2);
						}
					} else if (T.equals("SL")) {
						if (veriCat(dados[2], "S")) {
							Lab sl = new Lab(dados[0], Integer.parseInt(dados[1]), dados[2], pal.get(3), Integer.parseInt(pal.get(4)));
							return sl;
						} else {
							throw new OpcaoInvalidaException(0, 2);
						}
					} else if (T.equals("SC")) {
						if (veriCat(dados[2], "S")) {
							Comum sc = new Comum(dados[0], Integer.parseInt(dados[1]), dados[2], pal.get(3), Integer.parseInt(pal.get(4)));
							return sc;
						} else {
							throw new OpcaoInvalidaException(0, 2);
						}
					} else if (T.equals("D")) {
						if (veriCat(dados[2], T)) {
							Disciplina d = new Disciplina(dados[0], Integer.parseInt(dados[1]), dados[2]);
							return d;
						} else {
							throw new OpcaoInvalidaException(0, 2);
						}
					} else if (T.equals("Pr")) {
						Professor pr = new Professor(dados[0], Integer.parseInt(dados[1]));
						return pr;
					} else if (T.equals("T")) {
						Turma t = new Turma(dic, pro, dados[2]);
						return t;
					} else if (T.equals("A")) {
						Aluno a = new Aluno(dados[0], Integer.parseInt(dados[1]));
						return a;
					} else if (T.equals("I")) {
						Instituicao a = new Instituicao(dados[0], dados[1]);
						return a;
					}
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
				i--;
				continue;
			} catch (CampoEmBrancoException e) {
				e.msg();
				i--;
				continue;
			} catch (TipoDeAulaNaoAtribuidoException e) {
				e.msg();
				i--;
				continue;
			} catch(DisciplinaNaoInformadaException e) {
				e.msg();
				i--;
				continue;
			} catch(ProfessorNaoAtribuidoException e) {
				e.msg();
				i--;
				continue;
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido!");
				i--;
				continue;
			}
		}
		return null;
	}
	
	public static boolean veriCat(String s, String t) {
		if(t.equals("S")) {
			String[] took = s.trim().split("\\s+");
			if(took.length > 3) {
				return false;
			}
			else {
				for (int i=0; i<took.length; i++) {
					if(!took[i].equalsIgnoreCase("graduação") && !took[i].equalsIgnoreCase("pos-graduação") && !took[i].equalsIgnoreCase("extensão")) {
						return false;
					}
				}
				return true;
			}
		}else if(s.equalsIgnoreCase("Graduação") || s.equalsIgnoreCase("Pós-Graduação") || s.equalsIgnoreCase("Extensão")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Professor veripr(String s, int ind) {
		ArrayList<Professor> p = Main.getInst().get(ind).getProfsCadastrados();
		
		for (int i=0; i<p.size(); i++) {
			if (s.equals(p.get(i).getnome())) {
				return p.get(i);
			}
		}
		
		return null;
	}
	
	public static Disciplina veridic(String s, int ind) {
		ArrayList<Disciplina> d = Main.getInst().get(ind).getDiscCadastradas();
		
		for (int i=0; i<d.size(); i++) {
			if (s.equals(d.get(i).getNome())) {
				return d.get(i);
			}
		}
		
		return null;
	}

	public static void menuf(ArrayList<? extends Estrutura> o) {
		System.out.println("Selecione:");
		for(int i=0; i<o.size(); i++) {
			if(((Estrutura) o.get(i)) != null) {
				System.out.println("[" + (i+1) + "] " + ((Estrutura) o.get(i)).getnome());
			}else {
				o.remove(i);
			}
		}
		System.out.println("[<] Voltar");
	}
}
