package excecoes;
import java.io.IOException;

import javax.swing.JOptionPane;

import gui.Arq;

public class DisciplinaNaoInformadaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DisciplinaNaoInformadaException () {
	}
	
	public void msg () throws IOException {
		try {
			JOptionPane.showMessageDialog(null, "Informe a disciplina!");
			Arq.escreva(this.fillInStackTrace().toString() + "\n");
		}catch(IOException e) {
			Arq.escreva(e.fillInStackTrace().toString() + "\n");
			System.exit(0);
		}
	}
}
