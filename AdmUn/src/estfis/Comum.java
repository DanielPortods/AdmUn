package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;
import excecoes.DisciplinaNaoInformadaException;
import excecoes.OpcaoInvalidaException;
import excecoes.ProfessorNaoAtribuidoException;
import excecoes.TipoDeAulaNaoAtribuidoException;
import gui.Menus;

public class Comum extends Sala {
	
	private boolean tablado = false;
	
	public Comum (String nome, int cap, String cat, String tp, int and) {
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
				System.out.println("Ar condicionado: " + this.qtar + "  Lousa: " + this.numlousa + "\nProjetores: " + this.numproj + " Tablado: " + ((this.tablado==true) ? "Sim":"Não"));
				System.out.printf("\nTAXA DE OCUPAÇÃO: %.2f%%\n", this.oc.getTaxaOcupacao()*100);
				tab();
	}
	
}
