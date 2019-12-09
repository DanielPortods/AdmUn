package estfis;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import excecoes.*;
import gui.Menus;

public class Predio extends Estrutura{
	private int andares;
	ArrayList<Sala> sal = new ArrayList<>(); 
	
	public Predio(String nome, int and) {
		this.nome=nome;
		this.andares=and;
		this.formest="Salas";
	}
	
	@Override
	public ArrayList<? extends Estrutura> getEst() {
		return this.sal;
	}

	protected void caNew() throws CampoEmBrancoException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, OpcaoInvalidaException {
		String dado1=null, dado2=null, T=null;
		boolean sent = true;

		while (true) {
			try {
				if (sent) {
					dado1 = JOptionPane.showInputDialog("Qual tipo de sala?");
					if (dado1 == null) {
						break;
					} else if (dado1.trim().length() == 0) {
						throw new CampoEmBrancoException("o tipo da sala");
					} else if (dado1.equalsIgnoreCase("auditório")) {
						T = "SA";
						sent = false;
					} else if (dado1.equalsIgnoreCase("laboratório")) {
						T = "SL";
						sent = false;
					} else if (dado1.equalsIgnoreCase("comum")) {
						T = "SC";
						sent = false;
					} else {
						throw new OpcaoInvalidaException(this.andares, 5);
					}
				}
				if(!sent){

					dado2 = JOptionPane.showInputDialog("Qual o andar da sala?");
					if (dado2 == null) {
						break;
					} else if (dado2.trim().length() == 0) {
						throw new CampoEmBrancoException("o andar da sala");
					} else if (Integer.parseInt(dado2) > this.andares) {
						throw new OpcaoInvalidaException(this.andares, 6);
					} else {
						break;
					}
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
				continue;
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			}	
		}
		
		ArrayList<String> pal = new ArrayList<>();
		pal.add("Nome");
		pal.add("Capacidade");
		pal.add("Categoria");
		pal.add(dado1);
		pal.add(dado2);
		if(T.equals("SA")) {
			sal.add((Auditorio) Menus.caNew(3, pal, T));
		} else if(T.equals("SL")) {
			sal.add((Lab) Menus.caNew(3, pal, T));
		} else if(T.equals("SC")) {
			sal.add((Comum) Menus.caNew(3, pal, T));
		}
	}		

	@Override
	protected void opt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void det() {
		// TODO Auto-generated method stub
		
	}
}