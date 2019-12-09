package excecoes;
import javax.swing.JOptionPane;

public class TipoDeAulaNaoAtribuidoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public TipoDeAulaNaoAtribuidoException () {
	}
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Informe ao menos uma categoria de aulas");
	}
}
