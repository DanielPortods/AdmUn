package estfis;

public class Predio extends Estrutura{
	String nomeCp;
	private int andares;
	private int txoc;
	
	public Predio (String nome, int and, int txoc) {
		this.nomeCp = nome;
		this.andares = and;
		this.txoc = txoc;
	}
	public String getNomeCp() {
		return nomeCp;
	}
	public void setNomeCp(String nomeCp) {
		this.nomeCp = nomeCp;
	}
	public int getandares() {
		return andares;
	}
	public void setandares(int andares) {
		this.andares = andares;
	}
	 int getTxoc() {
		return txoc;
	}
	 void setTxoc(int txoc) {
		this.txoc = txoc;
	}
	
	

}
