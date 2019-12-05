package excecoes;
import javax.swing.JOptionPane;

public class TipoDeAulaNaoAtribuidoException {

	private static final long serialVersionUID = 1L;

	private String aula;
		
		public TipoDeAulaNaoAtribuidoException (String t) {
			this.aula = t;
		}
		
		public void msg () {
			JOptionPane.showMessageDialog(null, "Insira o tipo de aula " + aula);
		}
}	
