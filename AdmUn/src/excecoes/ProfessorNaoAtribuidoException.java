package excecoes;
import javax.swing.JOptionPane;

public class ProfessorNaoAtribuidoException extends Exception {
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Professor n�o atribu�do!");
	}
}