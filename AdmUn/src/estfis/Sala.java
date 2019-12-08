package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;
import excecoes.OpcaoInvalidaException;

public abstract class Sala extends Estrutura {
	protected String categoria, tipo;
	protected int andar, capacidade;
	
	public String gettp() {
		return this.tipo;
	}
	

}
