package estfis;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import abs.Ocupacao;
import abs.Horario;
import excecoes.*;
import gui.Menus;


public abstract class Sala extends Estrutura {
	protected String categoria, tipo;
	
	protected int andar, capacidade, numproj=0, numlousa=0, qtar=0;
	
	public Ocupacao oc = new Ocupacao();
	
	public String gettp() {
		return this.tipo;
	}	
	
	protected void tab() {
		System.out.println("OCUPAÇÃO:\n\n");
		
		System.out.print("–––––––––––––");
		for (int i=0;i<Horario.semana.length;i++) {
			System.out.print("  " + Horario.semana[i] + ((i==(Horario.semana.length-1)) ? "\n" : ""));
		}

		for (int i=0; i<Horario.periodo.length; i++) {
			for(int j=0; j<=Horario.semana.length; j++) {
				if(j==0) {
					System.out.print(Horario.periodo[i]);
					continue;
				}
				
				int n, I;
				if(Horario.semana[j-1].length() % 2 == 0) {
					n=Horario.semana[j-1].length()/2;
					I=1;
				}else {
					n=(Horario.semana[j-1].length()-1)/2;
					I=0;
				}
				
				for(int a=0; a<n-I; a++) {
					System.out.print(" ");
				}
				System.out.print("  " + ((this.oc.getGradeHoraria(i,j-1) == true) ?  "O" : "L"));
				if(j == Horario.semana.length) {
					System.out.println();
					continue;
				}
				for(int a=0; a<n; a++) {
					System.out.print(" ");
				}
			}
		}
	}
	
	protected int aloca(int n) throws OpcaoInvalidaException, IOException, HeadlessException {
		for(; n>0; n--) {
			try {
				String day = JOptionPane.showInputDialog("Informe o dia desejado:");
				if (day==null) {
					break;
				}
				
				String period = JOptionPane.showInputDialog("Informe o período desejado:");
				if (period == null) {
					break;
				}
				
				if (day.trim().length()==0 || period.trim().length()==0 ) {
					throw new CampoEmBrancoException("os dados obrigatórios");
				}
				if(this.oc.getGradeHoraria(Integer.parseInt(period), indday(day))) {
					throw new HorarioOcupadoException(); 
				}else {
					this.oc.setGradeHoraria(indday(day), Integer.parseInt(period), true);
				}
			}catch(HorarioOcupadoException e) {
				e.msg();
				n++;
				continue;
			}catch(CampoEmBrancoException e) {
				e.msg();
				n++;
				continue;
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe o Período desejado de 1 a 7");
				n++;
				continue;
			}
		}
		if(n==0) {
			JOptionPane.showMessageDialog(null, "Todas as aulas dessa turma já foram alocadas.");
		}
		
		return n;
	}
	
	public int home (String cat, int qtaulas) throws CampoEmBrancoException, IOException {
		String[] aux=null;
		try {
			aux = this.categoria.trim().split("\\s+");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			try {
				det();
				int sent=0;
				System.out.println("\n[<] Voltar  [+] alocar");
				String res = Menus.entrada();
				if(res.equals("<")) {
					break;
				}else if(res.equals("+")) {
					for(int i=0; i<aux.length; i++) {
						if(cat.equalsIgnoreCase(aux[i])) {
							sent++;
						}
					}
					if(sent>0) {
						qtaulas = aloca(qtaulas);
					}else {
						throw new OpcaoInvalidaException(0, 9);
					}
				} else
					try {
						{
							throw new OpcaoInvalidaException(0, 1);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}catch(OpcaoInvalidaException e) {
				e.msg();
			}
		}
		
		return qtaulas;
	}
	
	private int indday(String dia) throws OpcaoInvalidaException {
		int diaGrade;
		if(dia.equalsIgnoreCase("segunda")) {
			diaGrade = 0;
		} else if (dia.equalsIgnoreCase("terça")) {
			diaGrade = 1;
		} else if (dia.equalsIgnoreCase("quarta")) {
			diaGrade = 2;
		} else if (dia.equalsIgnoreCase("quinta")) {
			diaGrade = 3;
		} else if (dia.equalsIgnoreCase("sexta")) {
			diaGrade = 4;
		}else {
			throw new OpcaoInvalidaException(0,8);
		}
		return diaGrade;
	}
}
