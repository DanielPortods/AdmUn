package excecoes;
import javax.swing.JOptionPane;

public class ProfessorNaoAtribuidoException extends LogGeralException {
	
	private static final long serialVersionUID = 1L;
	public void msg () {
		JOptionPane.showMessageDialog(null, "Professor não atribuído!");
	}
}