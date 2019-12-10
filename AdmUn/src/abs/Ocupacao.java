package abs;

public class Ocupacao {
	private boolean[][] gradeHoraria = new boolean[7][5]; //true está ocupado, false está livre
	private int qtdLivres;
	private int qtdOcupados;
	private int taxaOcupacao;
	
	public Ocupacao() {
		this.qtdLivres = 35;
		this.qtdOcupados = 0;
		this.taxaOcupacao = 0;
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 5; j++) {
				this.gradeHoraria[i][j] = false;
			}
		}
	}
			
	public void setQtdOcupadosLivres() {
		int i = 0, j = 0;
		
		qtdLivres = 0;
		qtdOcupados = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 7; j++) {
				if(gradeHoraria[i][j] = false) {
					qtdLivres++;
				} else {
					qtdOcupados++;
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
	
	public void setTaxaOcupacao() {
		this.taxaOcupacao = qtdOcupados/qtdLivres;
	}
	
	public int getTaxaOcupacao() {
		return this.taxaOcupacao;
	}
	
	public void setGradeHoraria(String dia, int periodo, boolean ocup) {
		int diaGrade = 0;
		
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
		}
		
		this.gradeHoraria[diaGrade][periodo] = ocup;
	}
	
	public boolean getGradeHoraria(int i, int j) {		
		return this.gradeHoraria[i][j];
	}
}
