package excecoes;
import javax.swing.JOptionPane;

public class DisciplinaNaoInformadaException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String disc;
	
	public DisciplinaNaoInformadaException (String d) {
		this.disc = d;
	}
	
	public void msg () {
		JOptionPane.showMessageDialog(null, "Insira a disciplina " + disc);
	}
}
