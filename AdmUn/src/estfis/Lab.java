package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;

public class Lab extends Sala{

	public Lab(int cap, int andar, int txoc, int projetor, String[] tipo, String nomepr) {
		super(cap, andar, txoc, projetor, tipo, nomepr);
		// TODO Auto-generated constructor stub
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

}
