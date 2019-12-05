package excecoes;
import javax.swing.JOptionPane;

public class ProfessorNaoAtribuidoException extends Exception {

	private static final long serialVersionUID = 1L;

private String pro;
	
	public ProfessorNaoAtribuidoException (String p) {
		this.pro = p;
	}
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Insira o professor " + pro);
	}
}