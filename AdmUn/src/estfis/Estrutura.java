package estfis;

public abstract class Estrutura {
	protected String nome,
					 formest;
	protected int qtEst;
	
	public void home () {
		
	}
	void  setNome(String n) {
		this.nome = n;
		
	}
	void  setFormest(String n) {
		this.formest = n;
		
	}
	public String getNome() {
		return this.nome;
	}
	
	int getqtEst() {
		return this.qtEst;
	}
	void setqtEst(int n) {
		this.qtEst = n;
		
		
	}
	void opt() {
		
	}
	void changename (String nom) {
		this.nome = nom;
	}
	void cadNew() {
		
		
	}
	
}
