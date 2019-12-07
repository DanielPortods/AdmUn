package estfis;
import java.util.ArrayList;
import java.util.List;

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
	public void cadSala(int capac, int andar,int projetor,String[] tipo,String nompr) {
		txoc = 0;
			Sala sala = new Sala(capac, andar, txoc, projetor,tipo,nompr); 
			salas.add(sala);
			
		}
	

	@Override
	public ArrayList<? extends Estrutura> getEst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void caNew() throws CampoEmBrancoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void opt() {
		// TODO Auto-generated method stub
		
	}
	
}
