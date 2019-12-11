package estfis;
import gui.Menus;
import usr.Aluno;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import excecoes.*;

public abstract class Estrutura {
	protected String nome,
					 formest;
	protected int qtEst;
	
	public abstract ArrayList<? extends Estrutura> getEst();
	protected abstract void caNew() throws CampoEmBrancoException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, OpcaoInvalidaException, IOException;
	protected abstract void opt() throws DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, CampoEmBrancoException, TipoDeAulaNaoAtribuidoException, IOException;
	protected abstract void det() throws IOException;
	public abstract int home(String cat, int qtaulas) throws CampoEmBrancoException, IOException; 
	
	public void home (ArrayList<? extends Estrutura> cp) throws CampoEmBrancoException, OpcaoInvalidaException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, IOException {
		while (true) {
			try {
				Menus.menu(this.formest, cp, getnome());
				System.out.print(" [*] Opções");
				String res = Menus.entrada();

				if (res.equals("<")) {
					break;
				} else if (res.equals("+")) {
					caNew();
				} else if (res.equals("-")) {
					Menus.del(cp, this.formest);
				} else if (res.equals("*")) {
					opt();
				} else {
					int id = Integer.parseInt(res);
					if(this.formest.equals("Salas")) {
						while(true) {
							try {	
								cp.get(id - 1).det();
								System.out.println("[<] Voltar  [*] definir");
								String res3 = Menus.entrada();
								if(res3.equals("<")) {
									break;
								}else if(res3.equals("*")) {
									
								}else {
									throw new OpcaoInvalidaException(0, 1);
								}
							}catch(OpcaoInvalidaException e) {
								e.msg();
								continue;
							}
						}
					}else {
						cp.get(id - 1).home(cp.get(id-1).getEst());
					}
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe a posição na lista de " + this.formest);
				continue;
			}catch (IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, this.formest + " inexistente!");
				continue;
			}
		}
	}
	
	public String getnome() {
		return this.nome;
	}
	
	protected void changename (String nom) {
		this.nome = nom;
	}
}
