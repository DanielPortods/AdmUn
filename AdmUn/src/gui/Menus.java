package gui;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;
import abs.*;
import estfis.*;
import excecoes.CampoEmBrancoException;
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
		
		for(int i=0; i<o.size(); i++) {
			System.out.println("[" + (i+1) + "] " + ((Estrutura) o.get(i)).getnome());
		}
		System.out.println("\nQuantidade de " + tp + ": " + o.size());
		System.out.print("[+] Cadastrar " + tp + " [-] Excluir " + tp+"\n[<] Voltar");
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
	
	public static Object caNew(int qt, String[] pal, String T) throws CampoEmBrancoException {
		String[] dados = null;

		for (int i = 0; i < qt; i++) {
			try {
				dados[i] = JOptionPane.showInputDialog(pal[i] + ":");
				if (dados[i] == null) {
					Object o = null;
					return o;
				} else if (dados[i].trim().length() == 0) {
					if (T.equals("C")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal[i]);
						} else if (i == 1) {
							throw new CampoEmBrancoException("a " + pal[i]);
						}
					} else if (T.equals("P")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal[i]);
						} else if (i == 1) {
							throw new CampoEmBrancoException("a quantidade de " + pal[i]);
						}
					} else if (T.equals("S")) {
						if (i == 0) {
							throw new CampoEmBrancoException("o " + pal[i]);							
						} else if (i == 1) {
							throw new CampoEmBrancoException("qual o andar da sala");
						} else if (i == 2) {
							throw new CampoEmBrancoException("a " + pal[i]);			
						} else if (i == 3) {
							//
						}

					} else if (T.equals("D")) {

					} else if (T.equals("Pr")) {
						if (i == 0) {

						} else if (i == 1) {

						}
					} else if (T.equals("T")) {
						if (i == 0) {

						} else if (i == 1) {

						}
					} else if (T.equals("A")) {
						if (i == 0) {

						} else if (i == 1) {

						}

					}

				} else if (i == qt - 1) {
					if (T.equals("C")) {
						Campus c = new Campus(dados[0], dados[1]);
						return c;
					} else if (T.equals("P")) {
						Predio p = new Predio(dados[0], Integer.parseInt(dados[1]));
						return p;
					} else if (T.equals("S")) {
						Sala s = new Sala(dados[0], dados[1], dados[2], dados[3]);
						return s;
					} else if (T.equals("D")) {
						Disciplina d = new Disciplina(dados[0], Integer.parseInt(dados[1]), dados[2]);
						return d;
					} else if (T.equals("Pr")) {
						Professor pr = new Professor(dados[0], Integer.parseInt(dados[1]));
						return pr;
					} else if (T.equals("T")) {
						Turma t = new Turma(dados[0], dados[1]);
						return t;
					} else if (T.equals("A")) {
						Aluno a = new Aluno(dados[0], Integer.parseInt(dados[1]));
						return a;
					}
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				i--;
				continue;
			}
		}
		return null;
	}
	
}
