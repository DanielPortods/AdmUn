package estfis;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import excecoes.CampoEmBrancoException;
import estfis.Predio;

public class Campus extends Estrutura {
	ArrayList<Predio> prd = new ArrayList<Predio>();
	String cidade;
	String nomeInst;
	public ArrayList<? extends Estrutura> getEst(){
		return this.prd;
	}
	
	


	@Override
	protected void opt() {}



public Campus (String nome,String cid) {
	this.cidade = cid;
	this.nomeInst = nome;
	this.formest = "Predio";
}
    public String getCidade() {
	return cidade;
}
 void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getnome() {
	return nomeInst;
}
public void setNomeInst(String nomeInst) {
	this.nomeInst = nomeInst;
}
		

protected void caNew() throws CampoEmBrancoException {
	String nome = null;
	int andares = 0;
	
	while (true) {	
		try {
			nome = JOptionPane.showInputDialog("Nome:");
			if(nome == null) {
				return;					
			}
			else if (nome.trim().length() == 0) {
				throw new CampoEmBrancoException("o nome do predio");
			}
			else {
				break;
			}
		} catch (CampoEmBrancoException e) {
			e.msg();
			continue;
		} 
	}
	
	while(true) {			
		try {
			andares = Integer.parseInt(JOptionPane.showInputDialog("Andares:"));
			 if (andares == 0) {
				throw new CampoEmBrancoException("a quantidade de andares " + nome);
			}
			else {
				Predio i = new Predio(nome, andares);
				prd.add(i);
				break;
			}		
		}catch(CampoEmBrancoException e) {
			e.msg();
		}	
	}
}
	
	
	

		
	}

