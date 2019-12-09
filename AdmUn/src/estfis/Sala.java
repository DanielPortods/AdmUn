package estfis;

import java.util.ArrayList;

import abs.Ocupacao;
import excecoes.CampoEmBrancoException;
import excecoes.OpcaoInvalidaException;

public abstract class Sala extends Estrutura {
	protected String categoria, tipo;
	protected int andar, capacidade;
	public Ocupacao ocup;
	
	public String gettp() {
		return this.tipo;
	}
	

}
