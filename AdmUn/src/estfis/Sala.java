package estfis;

public abstract class Sala extends Estrutura {
	private int capacidade,
	andar,txoc,projetor;
	private String tipo[];
	private String nompr;
	public String getNompr() {
		return nompr;
	}
	public void setNompr(String nompr) {
		this.nompr = nompr;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getTxoc() {
		return txoc;
	}
	public void setTxoc(int txoc) {
		this.txoc = txoc;
	}
	public int getProjetor() {
		return projetor;
	}
	public void setProjetor(int projetor) {
		this.projetor = projetor;
	}
	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	public String getnompr() {
		return nompr;
	}
	public void setnompr(String nompr) {
		this.nompr = nompr;
	}
	
	
	

}
