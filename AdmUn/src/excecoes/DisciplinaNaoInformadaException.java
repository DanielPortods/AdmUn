package excecoes;
import javax.swing.JOptionPane;

public class DisciplinaNaoInformadaException extends Exception {
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Disciplina n�o informada!");
	}
}