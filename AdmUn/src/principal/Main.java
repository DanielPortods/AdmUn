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
	
	public static void main(String[] args) throws CampoEmBrancoException{
		 while (true) {
			Menus.enter();
			String res = Menus.entrada();
			
			if(res.equals("1")) {
				while(true) {
					Menus.menu("Instituições", inst);
					
					String res2 = Menus.entrada();
					
					if(res2.equals("<")) {
						break;
					}
					else if(res2.equals("+")) {
						cadnewin();
					}
				}
			}
			else if(res.equals("2")) {
				break;
			}
			else {
				//OpcaoInvalidaException
			}
			
		}
	}
	
	static void cadnewin() throws CampoEmBrancoException {
		
		try {
			String nome = JOptionPane.showInputDialog("Nome:");
			if (nome == null || nome.trim().length() == 0) {
				throw new CampoEmBrancoException("da instituição");
			}
		}
		catch (CampoEmBrancoException e) {
			e.msg();
		}
		//String uf = JOptionPane.showInputDialog("UF:");
		//Instituicao i = new Instituicao(nome, uf);
		//inst.add(i);
	}
}
