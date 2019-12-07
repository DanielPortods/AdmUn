package excecoes;
import javax.swing.JOptionPane;

public class TipoDeAulaNaoAtribuidoException extends LogGeralException {
	
	private static final long serialVersionUID = 1L;
	public void msg () {
		JOptionPane.showMessageDialog(null, "Tipo de aula não atribuído!");
	}
	
}