package excecoes;
import javax.swing.JOptionPane;

public class OpcaoInvalidaException extends LogGeralException {

	private static final long serialVersionUID = 1L;
	private String msg = "Opcao invalida!";
	
	public void msg () {
		JOptionPane.showMessageDialog(null, msg);
	}
}
