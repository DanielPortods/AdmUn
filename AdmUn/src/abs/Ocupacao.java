package abs;

public class Ocupacao {
	private int horarioInicio;  
	private int horarioFim;
	
	private String dia;
	
	public Ocupacao(int horarioInicio, int horarioFim, String dia) {
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.dia = dia;
	}
	
	public void setHorarioInicio(int horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	
	public void setHorarioFIm(int horarioFim) {
		this.horarioFim = horarioFim;
	}
	
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public int getHorarioInicio() {
		return this.horarioInicio;
	}
	
	public int getHorarioFim() {
		return this.horarioFim;
	}
	
	public String getDia() {
		return this.dia;
	}
}
