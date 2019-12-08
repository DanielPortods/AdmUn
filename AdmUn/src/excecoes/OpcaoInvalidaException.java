package excecoes;
import javax.swing.JOptionPane;

public class OpcaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	int oc;
	public OpcaoInvalidaException (int oc) {
		this.oc=oc;
	}
	public void msg () {
		if(oc==1) {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}else if(oc==2){
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
											  + "Suas opções são:\n"
											  + "- Graduação;\n"
											  + "- Pós-graduação;\n"
											  + "- Extenção.");
		}
		else if(oc==3){
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
											  + "Professor não encontrado");
		}
		else if(oc==4) {
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
					  						  + "Disciplina não encontrada");
		}
		
	}
}
