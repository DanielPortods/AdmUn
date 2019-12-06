package excecoes;
import javax.swing.JOptionPane;

public class DisciplinaNaoInformadaException extends Exception {

	private static final long serialVersionUID = 1L;
	public void msg () {
		JOptionPane.showMessageDialog(null, "Disciplina não informada!");
	}
}