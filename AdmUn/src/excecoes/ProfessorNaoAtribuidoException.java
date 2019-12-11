package excecoes;
import java.io.IOException;
import javax.swing.JOptionPane;

import gui.Arq;

public class ProfessorNaoAtribuidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ProfessorNaoAtribuidoException () {
	}
	
	public void msg () throws IOException {
		try {
			JOptionPane.showMessageDialog(null, "Informe um professor");
			Arq.escreva(this.fillInStackTrace().toString() + "\n");
		}catch(IOException e) {
			Arq.escreva(this.fillInStackTrace().toString() + "\n");
			System.exit(0);
		}
	}
}
