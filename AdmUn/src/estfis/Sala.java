package estfis;

import java.util.ArrayList;

import excecoes.CampoEmBrancoException;

public class Sala extends Estrutura {
	private int capacidade,
	andar,txoc,projetor;
	private String tipo[];
	private String nompr;

	
	public Sala (int cap, int andar, int txoc, int projetor,String[] tipo, String nomepr) {
		this.capacidade = cap;
		this.andar = andar;
		this.txoc = txoc;
		this.projetor = projetor;
		this.tipo[3] = tipo[3];
		this.nompr = nomepr;
		
		
	}
	
	 String getNompr() {
		return nompr;
	}
	 void setNompr(String nompr) {
		this.nompr = nompr;
	}
	 int getCapacidade() {
		return capacidade;
	}
  void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	 int getAndar() {
		return andar;
	}
	 void setAndar(int andar) {
		this.andar = andar;
	}
	 int getTxoc() {
		return txoc;
	}
	 void setTxoc(int txoc) {
		this.txoc = txoc;
	}
	 int getProjetor() {
		return projetor;
	}
	 void setProjetor(int projetor) {
		this.projetor = projetor;
	}
	 private String[] getTipo() {
		return tipo;
	}
	 private void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	 public String getnome() {
		return nompr;
	}
	 void setnompr(String nompr) {
		this.nompr = nompr;
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
