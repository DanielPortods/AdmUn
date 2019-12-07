package excecoes;
import javax.swing.JOptionPane;

public class OpcaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	private String msg = "Opção inválida!";
	
	public void msg () {
		JOptionPane.showMessageDialog(null, msg);
	}
}
