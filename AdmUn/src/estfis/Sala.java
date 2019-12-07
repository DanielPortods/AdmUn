package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;
import excecoes.OpcaoInvalidaException;

public class Sala extends Estrutura {
	protected String andar, capacidade, tipo;
	
	public Sala (String nome, String andar, String cap, String tipo) {
		this.nome=nome;
		this.andar=andar;
		this.capacidade=cap;
		this.tipo=tipo;
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
	protected void opt() throws OpcaoInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void det() {
		// TODO Auto-generated method stub
		
	}

}
