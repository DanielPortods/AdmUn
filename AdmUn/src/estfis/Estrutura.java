package estfis;
import gui.Menus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import excecoes.*;

public abstract class Estrutura {
	protected String nome,
					 formest;
	protected int qtEst;
	
	public abstract ArrayList<? extends Estrutura> getEst();
	protected abstract void caNew() throws CampoEmBrancoException;
	protected abstract void opt();
	public void home (ArrayList<? extends Estrutura> cp) throws CampoEmBrancoException{
		while (true) {
			try {
				Menus.menu(this.formest, cp, getnome());
				System.out.print(" [*] Opções");
				String res = Menus.entrada();

				if (res.equals("<")) {
					break;
				} else if (res.equals("+")) {
					caNew();
				} else if (res.equals("-")) {
					Menus.del(cp, this.formest);
				} else if (res.equals("*")) {
					opt();
				} else {
					int id = Integer.parseInt(res);
					cp.get(id - 1).home(cp.get(id-1).getEst());
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe a posição na lista de " + this.formest);
				continue;
			}
		}
	}

	void  setNome(String n) {
		this.nome = n;
		
	}
	void  setFormest(String n) {
		this.formest = n;
		
	}
	
	
	public String getnome() {

		return this.nome;
	}
	

	int getqtEst() {
		return this.qtEst;
	}
	void setqtEst(int n) {
		this.qtEst = n;
		
		
	}
	

	void changename (String nom) {
		this.nome = nom;

	}
	void cadNew() {
		
		
	}

	}	


