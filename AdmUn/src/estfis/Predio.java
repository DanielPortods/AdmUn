package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;

public class Predio extends Estrutura{
	private int andares;
	
	public Predio(String nome, int and) {
		this.nome=nome;
		this.andares=and;
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

	@Override
	protected void det() {
		// TODO Auto-generated method stub
		
	}
	
}
