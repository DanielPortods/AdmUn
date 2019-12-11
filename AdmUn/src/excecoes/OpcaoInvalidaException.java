package excecoes;
import java.io.IOException;
import javax.swing.JOptionPane;
import gui.Arq;

public class OpcaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	int and, oc;
	public OpcaoInvalidaException (int and, int oc) {
		this.and=and;
		this.oc=oc;
	}
	public void msg () throws IOException {
		try {
			if (oc == 1) {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			} else if (oc == 2) {
				JOptionPane.showMessageDialog(null, "Opção inválida!\n" + "Suas opções são:\n" + "- Graduação;\n"
						+ "- Pós-graduação;\n" + "- Extenção.");
			} else if (oc == 3) {
				JOptionPane.showMessageDialog(null, "Opção inválida!\n" + "Professor não encontrado");
			} else if (oc == 4) {
				JOptionPane.showMessageDialog(null, "Opção inválida!\n" + "Disciplina não encontrada");
			} else if (oc == 5) {
				JOptionPane.showMessageDialog(null, "Opção inválida!\n" + "Suas opções são:\n" + "- Auditório;\n"
						+ "- Laboratório;\n" + "- Comum.");
			} else if (oc == 6) {
				JOptionPane.showMessageDialog(null, "Opção inválida!\n" + "Este Prédio possui " + and + " andares.");
			} else if (oc == 7) {
				JOptionPane.showMessageDialog(null, "Prédio não cadastrado!");
			} else if (oc == 8) {
				JOptionPane.showMessageDialog(null, "Informe um dia da semana!");
			} else if (oc == 9) {
				JOptionPane.showMessageDialog(null, "Categorias Diferentes!");
			}
			Arq.escreva(this.fillInStackTrace().toString() + "\n");
		} catch (IOException e) {
			Arq.escreva(e.fillInStackTrace().toString() + "\n");
			System.exit(0);
		}
	}
}
