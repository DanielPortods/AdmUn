package excecoes;
import javax.swing.JOptionPane;

public class ProfessorNaoAtribuidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ProfessorNaoAtribuidoException () {
	}
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Informe um professor");
	}
}
