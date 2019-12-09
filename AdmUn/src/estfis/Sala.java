package estfis;
import java.util.ArrayList;
import abs.Ocupacao;
import excecoes.CampoEmBrancoException;
import excecoes.DisciplinaNaoInformadaException;
import excecoes.OpcaoInvalidaException;
import excecoes.ProfessorNaoAtribuidoException;
import excecoes.TipoDeAulaNaoAtribuidoException;


public abstract class Sala extends Estrutura {
	protected String categoria, tipo;
	protected int andar, capacidade, numproj=0, numlousa=0, qtar=0;
	
	Ocupacao oc = new Ocupacao();
	
	public String gettp() {
		return this.tipo;
	}	
	
	public void home2 () {
		det();
		
		System.out.println("OCUPAÇÃO:   CHEGEUUEUEIEIEIE");		
					
	}	
}
