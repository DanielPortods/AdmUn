package excecoes;
import javax.swing.JOptionPane;

public class CampoEmBrancoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String tp;
	
	public CampoEmBrancoException (String n) {
		this.tp = n;
	}
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Insira o nome " + tp);
	}
}
