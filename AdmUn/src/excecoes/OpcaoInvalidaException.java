package excecoes;
import javax.swing.JOptionPane;

public class OpcaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	int and, oc;
	public OpcaoInvalidaException (int and, int oc) {
		this.and=and;
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
		}else if(oc==3){
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
											  + "Professor não encontrado");
		}else if(oc==4) {
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
					  						  + "Disciplina não encontrada");
		}else if(oc==5){
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
											  + "Suas opções são:\n"
											  + "- Auditório;\n"
											  + "- Laboratório;\n"
											  + "- Comum.");
		}else if(oc==6) {
			JOptionPane.showMessageDialog(null, "Opção inválida!\n"
											  + "Este Prédio possui " + and + " andares.");
		}else if(oc==7) {
			JOptionPane.showMessageDialog(null, "Prédio não cadastrado!");
}
	}
}
