package estfis;
import java.util.ArrayList;
import estfis.Sala;
import java.util.List;

import javax.swing.JOptionPane;

import estfis.Sala;

import java.util.ArrayList;


import excecoes.CampoEmBrancoException;

public class Predio extends Estrutura{
	String nomeCp;
	private int andares;
	private int txoc;
	private List<Sala> salas = new ArrayList<Sala>();
	
	public Predio (String nome, int and) {
		this.nomeCp = nome;
		this.andares = and;
		this.txoc = 0;
		this.formest = "Predio";
	}
	public String getnome() {
		return nomeCp;
	}
	public void setNomeCp(String nomeCp) {
		this.nomeCp = nomeCp;
	}
	public int getandares() {
		return andares;
	}
	public void setandares(int andares) {
		this.andares = andares;
	}
	 int getTxoc() {
		return txoc;
	}
	 void setTxoc(int txoc) {
		this.txoc = txoc;
	}
	

	@Override
	public ArrayList<? extends Estrutura> getEst() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void caNew() throws CampoEmBrancoException {
		String nome = null;
		int capacidade = 0;
		int andar =0;
		int txoc =0;
		String tipo = null;
		int projetor = 0;
		String predio = null;
		
		while (true) {	
			try {
				nome = JOptionPane.showInputDialog("Nome da sala:");
				if(nome == null) {
					return;					
				}
				else if (nome.trim().length() == 0) {
					throw new CampoEmBrancoException("o nome da sala");
				}
				else {
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			} 
		}
		while (true) {	
			try {
				predio = JOptionPane.showInputDialog("EM QUE PREDIO?:");
				if(predio == null) {
					return;					
				}
				else if (predio.trim().length() == 0) {
					throw new CampoEmBrancoException("o nome do predio");
				}
				else {
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			} 
		}
		while (true) {	
			try {
				tipo = JOptionPane.showInputDialog("Tipo da Sala:");
				if(tipo == null) {
					return;					
				}
				else if (tipo.trim().length() == 0) {
					throw new CampoEmBrancoException("o tipo da sala");
				}
				else {
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			} 
		}
		
		while(true) {			
			try {
				capacidade = Integer.parseInt(JOptionPane.showInputDialog("Capacidade:"));
				 if (capacidade == 0) {
					throw new CampoEmBrancoException("a capacidade da" + nome);
				}
				else {
					break;
				}		
			}catch(CampoEmBrancoException e) {
				e.msg();
			}	
		}
		while(true) {			
			try {
				projetor = Integer.parseInt(JOptionPane.showInputDialog("Quantos projetores?:"));
				 if (projetor == 0) {
					throw new CampoEmBrancoException("quantidade de projetores da" + nome);
				}
				else {
					
					
					
					Sala i = new Sala(capacidade, andar,txoc,projetor,tipo,predio);
					salas.add(i);
					break;
				}		
			}catch(CampoEmBrancoException e) {
				e.msg();
			}	
		}
	}

	@Override
	protected void opt() {
		// TODO Auto-generated method stub
		
	}
	
}
