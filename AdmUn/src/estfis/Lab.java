package estfis;

import java.util.ArrayList;

import excecoes.*;
import gui.Menus;


public class Lab extends Sala{
	
	private int qtcpu = this.capacidade;
	private boolean lousaIt = false;
	
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
		System.out.println("--------------- " + this.nome + " ---------------");
		System.out.println("   " + this.tipo);
		System.out.println("Andar: " + this.andar);
		System.out.println("Capacidade: " + this.capacidade);
		System.out.println("Catergoria: " + this.categoria);
		System.out.println("Ar condicionado: " + this.qtar + "  Lousa: " + this.numlousa + "\nProjetores: " + this.numproj + " Lousa interativa: " + ((this.lousaIt==true) ? "Sim":"Não"));
		System.out.println("Computadores: " + this.qtcpu);
		System.out.println("\nTAXA DE OCUPAÇÃO: " + this.oc.getTaxaOcupacao());		
	}

}
