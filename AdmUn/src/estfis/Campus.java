package estfis;
import java.util.ArrayList;
import excecoes.CampoEmBrancoException;

public class Campus extends Estrutura {
	String cidade;
	ArrayList<Predio> prd = new ArrayList<>();
	
	public Campus (String nome, String cd) {
		this.nome = nome;
		this.cidade = cd;
		this.formest = "Prédios";
	}
	
	public ArrayList<? extends Estrutura> getEst(){
		return this.prd;
	}
	
	protected void caNew() throws CampoEmBrancoException{
		
	}
}
