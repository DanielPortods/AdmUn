package principal;
import gui.Home;
import gui.Menus;
import estfis.Instituicao;
import excecoes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	//private static Home h;
	private static ArrayList<Instituicao> inst = new ArrayList<>();
	
	public static void main(String[] args) throws OpcaoInvalidaException, NumberFormatException, CampoEmBrancoException{

		while (true) {
			try {
				Menus.enter();
				String res = Menus.entrada();
				if (res.equals("1")) {
					while (true) {
						try {
							Menus.menu("Instituições", inst);
							String res2 = Menus.entrada();

							if (res2.equals("<")) {
								break;
							} else if (res2.equals("+")) {
								cadnewin();
							} else if (res2.equals("-")) {
								delinst();
							} else {
								int id = Integer.parseInt(res2);
								inst.get(id - 1).home();
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Informe a posição na lista de instituições ");
							continue;
						}
					}
				} else if (res.equals("2")) {
					break;
				} else {
					throw new OpcaoInvalidaException();
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
				continue;
			} 
		}	
	}
	
	static void cadnewin() throws CampoEmBrancoException {
		
		String nome = null;
		String uf = null;
		
		while (true) {	
			try {
				nome = JOptionPane.showInputDialog("Nome:");
				if(nome == null) {
					return;					
				}
				else if (nome.trim().length() == 0) {
					throw new CampoEmBrancoException("o nome da instituição");
				}
				else {
					break;
				}
			} catch (CampoEmBrancoException e) {
				e.msg();
				continue;
			} 
		}
		
		while(true) {			
			try {
				uf = JOptionPane.showInputDialog("UF:");
				if(uf == null) {
					return;
				}
				else if (uf.trim().length() == 0) {
					throw new CampoEmBrancoException("a UF da instituição");
				}
				else {
					Instituicao i = new Instituicao(nome, uf);
					inst.add(i);
					break;
				}		
			}catch(CampoEmBrancoException e) {
				e.msg();
			}	
		}
	}
	
	static void delinst() throws IndexOutOfBoundsException, NumberFormatException {
		while (true) {
			try {
				String ids = JOptionPane.showInputDialog("Número da instituição a ser deletada:");
				if (ids == null) {
					break;
				}
				else {
					int id = Integer.parseInt(ids);
					inst.remove(id - 1);
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Não há nenhuma instituição na posição informada");
				continue;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe a posição na lista de instituições ");
				continue;
			}
		}
	}
}