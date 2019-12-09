package abs;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import estfis.Predio;
import usr.*;
import estfis.Sala;
import excecoes.OpcaoInvalidaException;
import gui.Menus;


public class Turma {
	String codigo;
	Disciplina  ds;
	Professor prof;
	Sala sal;
	ArrayList<Predio> p = new ArrayList<>();
	
	public Turma(Disciplina ds, Professor pr, String co) {
		this.codigo=co;
		this.prof=pr;
		this.ds=ds;
	}
	
	public void home(ArrayList<Predio> p) throws OpcaoInvalidaException {
		this.p=p;
		while (true) {
			try {
				System.out.println("--------------- " + this.ds.getNome() + "  " + this.codigo + " ---------------");
				System.out.println("Professor: " + this.prof.getnome());
				System.out.println("Sala: " + ((sal == null) ? "Sem sala" : sal.getnome()));
				System.out.println("Horaraio: " + ((sal == null) ? "a determinar" : gethr()));
				System.out.println("\n[<] voltar  [+] Alocar");
				String res = Menus.entrada();

				if (res.equals("<")) {
					break;
				} else if (res.equals("+")) {
					alocar(this.p);
				} else {
					throw new OpcaoInvalidaException(0, 1);
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
				continue;
			}
		}
	}
	
	private void alocar(ArrayList<Predio> p) throws OpcaoInvalidaException {
		while(true) {
			try {
			Menus.menuf(p);
			String res = Menus.entrada();
			
			if(res.equals("<")) {
				break;
			}else {
					int id = Integer.parseInt(res);
					while (true) {
						try {
							Menus.menuf((p.get(id - 1).getEst()));
							String res2 = Menus.entrada();
							
							if(res2.equals("<")) {
								break;
							}else {
									int id2 = Integer.parseInt(res);
									p.get(id-1).getEst().get(id2-1).home2();
							}
						}catch(NumberFormatException e) {
							//log aqui!!
							JOptionPane.showMessageDialog(null, "Informe a posição na lista de Prédios");
							continue;
						}catch(IndexOutOfBoundsException e) {
							//log aqui!!
							JOptionPane.showMessageDialog(null, "Prédio Inexistente ");
							continue;
						}
					}				
			}
			}catch(NumberFormatException e) {
				//log aqui!!
				JOptionPane.showMessageDialog(null, "Informe a posição na lista de Prédios");
				continue;
			}catch(IndexOutOfBoundsException e) {
				//log aqui!!
				JOptionPane.showMessageDialog(null, "Prédio Inexistente ");
				continue;
			}
		}
		
	}
	
	private String gethr() {
		return null;
	}
	
	public Professor getprof () {
		return this.prof;
	}
	
	public Disciplina getdisc() {
		return this.ds;
	}
	
	public String getcod() {
		return this.codigo;
	}
}