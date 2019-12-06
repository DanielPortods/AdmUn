package excecoes;
import javax.swing.JOptionPane;

public class TipoDeAulaNaoAtribuidoException extends Exception {
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Tipo de aula não atribuído!");
	}
	
}