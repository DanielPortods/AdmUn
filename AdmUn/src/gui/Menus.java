package gui;
import java.util.ArrayList;
import java.util.Scanner;
import estfis.Estrutura;


public class Menus {
	
	public static void enter() {
		System.out.println("--------------- AdmUn ---------------");
		System.out.println("Bem vindo ao gerenciador de universidades");
		System.out.println("          [1] Entrar");
		System.out.println("          [2] Fechar");
	}
	
	public static void menu(String tp, ArrayList<? extends Estrutura> o) {
		System.out.println("--------------- AdmUn ---------------");
		System.out.println("  " + tp + ":");
		
		for(int i=0; i<o.size(); i++) {
			System.out.println("[" + (i+1) + "] " + o.get(i).getnome());
		}
		System.out.println("\nQauntidade de " + tp + ": " + o.size());
		System.out.println("[+] Cadastrar nova " + tp + " [-] Excluir " + tp+"\n[<] Voltar");
	}
	
	public static String entrada() {
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		clear();
		return r;
	}
	
	private static void clear() {
		System.out.println('\u000C'); 
	}
}
