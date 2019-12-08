package abs;
import usr.*;

public class Turma {
	String codigo;
	Disciplina  ds;
	Professor prof;
	
	public Turma(Disciplina ds, Professor pr, String co) {
		this.codigo=co;
		this.prof=pr;
		this.ds=ds;
	}
	
	public Disciplina getdisc() {
		return this.ds;
	}
	
	public String getcod() {
		return this.codigo;
	}
}
