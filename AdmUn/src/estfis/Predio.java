package estfis;

import java.util.ArrayList;
import excecoes.*;

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
