package abs;

import estfis.Sala;

public class Ocupacao {
	private boolean[][] gradeHoraria = new boolean[7][5]; //true está ocupado, false está livre
	private int qtdLivres;
	private int qtdOcupados;
	private float taxaOcupacao;
	
	public Ocupacao() {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 5; j++) {
				this.gradeHoraria[i][j] = false;
			}
		}
	}
			
	public void setQtdOcupadosLivres() {
		this.qtdLivres = 0;
		this.qtdOcupados = 0;
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 5; j++) {
				if(!gradeHoraria[i][j]) {
					this.qtdLivres++;
				} else {
					this.qtdOcupados++;
				}
			}
		}
	}
	
	public int getQtdLivres() {
		return this.qtdLivres;
	}
	
	public int getQtdOcupados() {
		return this.qtdOcupados;
	}	
		
	public float getTaxaOcupacao() {
		setQtdOcupadosLivres();
		this.taxaOcupacao = (float) getQtdOcupados()/getQtdLivres();
		return this.taxaOcupacao;
	}
	
	public void setGradeHoraria(int dia, int periodo, boolean ocup) {		
		this.gradeHoraria[periodo-1][dia] = ocup;
	}
	
	public void setGradeHoraria(Sala sala) {
		for (int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				if(sala.oc.getGradeHoraria(i, j)) {
					this.gradeHoraria[i][j]=true;
				}
			}
		}
	}
	
	public boolean getGradeHoraria(int i, int j) {		
		return this.gradeHoraria[i][j];
	}
}