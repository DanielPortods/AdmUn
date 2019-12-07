package gui;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import estfis.Estrutura;


public class Menus {
	
	public static void enter() {
		System.out.println("--------------- AdmUn ---------------");
		System.out.println("Bem vindo ao gerenciador de universidades");
		System.out.println("          [1] Entrar");
		System.out.println("          [2] Fechar");
	}
	
	public static void menu(String tp, ArrayList<? extends Estrutura> o, String nom) {
		System.out.println("--------------- " + nom + " ---------------");
		System.out.println("  " + tp + ":");
		
		for(int i=0; i<o.size(); i++) {
			System.out.println("[" + (i+1) + "] " + o.get(i).getnome());
		}
		System.out.println("\nQuantidade de " + tp + ": " + o.size());
		System.out.print("[+] Cadastrar " + tp + " [-] Excluir " + tp+"\n[<] Voltar");
	}
	
	public static String entrada() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		return r;
	}
	
	public static void del(ArrayList<? extends Object> lst, String tp) {
		while (true) {
			try {
				String ids = JOptionPane.showInputDialog("Informe o número de qual " + tp + " deseja excluir:");
				if (ids == null) {
					break;
				}
				else {
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
}
