package estfis;

import java.util.ArrayList;

import excecoes.*;


public class Lab extends Sala{
	
	public Lab (String nome, int cap, String cat, String tp, int and) {
		this.nome=nome;
		this.capacidade=cap;
		this.categoria=cat;
		this.tipo=tp;
		this.andar=and;
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
	protected void opt() throws DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, CampoEmBrancoException,
			TipoDeAulaNaoAtribuidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void det() {
		// TODO Auto-generated method stub
		
	}

}
