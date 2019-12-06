package excecoes;
import javax.swing.JOptionPane;

public class DisciplinaNaoInformadaException(String msg) extends Exception {
	super(msg);
}

@Override
	public String toString() { 
		return "Disciplina %s não informada".format(msg);
}
