package abs;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import estfis.Predio;
import usr.*;
import estfis.Sala;
import excecoes.*;
import gui.Arq;
import gui.Menus;


public class Turma {
	String codigo;
	Disciplina  ds;
	Professor prof;
	Sala sal;
	ArrayList<Predio> p = new ArrayList<>();
	int qtaulas;
	
	public Turma(Disciplina ds, Professor pr, String co) {
		this.codigo=co;
		this.prof=pr;
		this.ds=ds;
		setqtaulas();
	}
	
	public void home(ArrayList<Predio> p) throws OpcaoInvalidaException, CampoEmBrancoException, IOException {
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
					if(qtaulas==0) {
						JOptionPane.showMessageDialog(null, "Todas as aulas dessa turma já foram alocadas.");
						continue;
					}
					
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
	
	private void alocar(ArrayList<Predio> p) throws OpcaoInvalidaException, CampoEmBrancoException, IOException {
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
								qtaulas = p.get(id-1).getEst().get(id2-1).home(ds.getCat(), this.qtaulas);
							}
						}catch(NumberFormatException e) {
							Arq.escreva(e.fillInStackTrace().toString() + "\n");
							JOptionPane.showMessageDialog(null, "Informe a posição na lista de Prédios");
							continue;
						}catch(IndexOutOfBoundsException e) {
							Arq.escreva(e.fillInStackTrace().toString() + "\n");
							JOptionPane.showMessageDialog(null, "Prédio Inexistente ");
							continue;
						}
					}				
			}
			}catch(NumberFormatException e) {
				Arq.escreva(e.fillInStackTrace().toString() + "\n");
				JOptionPane.showMessageDialog(null, "Informe a posição na lista de Prédios");
				continue;
			}catch(IndexOutOfBoundsException e) {
				Arq.escreva(e.fillInStackTrace().toString() + "\n");
				JOptionPane.showMessageDialog(null, "Prédio Inexistente ");
				continue;
			}
		}
		
	}
	
	private void setqtaulas(){
		this.qtaulas = this.ds.getCredito()/2;
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