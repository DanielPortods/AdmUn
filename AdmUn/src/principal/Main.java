package principal;
//import gui.Home;
import gui.Menus;
import estfis.Instituicao;
import excecoes.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
							Menus.menu("Instituições", inst, "AdmUn");
							String res2 = Menus.entrada();

							if (res2.equals("<")) {
								break;
							} else if (res2.equals("+")) {
								cadnewin();
							} else if (res2.equals("-")) {
								Menus.del(inst, "Instituição");
							} else {
								int id = Integer.parseInt(res2);
								inst.get(id - 1).home(inst.get(id-1).getEst());
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Informe a posição na lista de instituições ");

											Main erros = new Main();			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("logErros.txt")));
							o.writeObject(erros);
							o.close();
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
}