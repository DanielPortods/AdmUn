package excecoes;
import java.io.IOException;

import javax.swing.JOptionPane;

import gui.Arq;

public class CampoEmBrancoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String tp;
	
	public CampoEmBrancoException (String n) {
		this.tp = n;
	}
	
	public void msg () throws IOException {
		try {
			JOptionPane.showMessageDialog(null, "Informe " + tp);
			Arq.escreva(this.fillInStackTrace().toString() + "\n");
		}catch(IOException e) {
			Arq.escreva(e.fillInStackTrace().toString() + "\n");
			System.exit(0);
		}
	}
}
