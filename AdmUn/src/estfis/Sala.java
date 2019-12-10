package estfis;
import java.util.ArrayList;
import abs.Ocupacao;
import abs.Horario;
import excecoes.*;
import gui.Menus;


public abstract class Sala extends Estrutura {
	protected String categoria, tipo;

	protected int andar, capacidade, numproj=0, numlousa=0, qtar=0;
	
	Ocupacao oc = new Ocupacao();
	
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
	
	public void home2 () {
		while(true) {
			try {
				det();
				
				System.out.println("\n[<] Voltar  [+] alocar");
				String res = Menus.entrada();
				if(res.equals("<")) {
					
				}else if(res.equals("+")) {
					
				}else {
					throw new OpcaoInvalidaException(0, 1);
				}
			}catch(OpcaoInvalidaException e) {
				e.msg();
			}
		}
	}	
}
