package estfis;

public class Comum extends Sala {
	private Boolean ar;
	
	private Int qtar;
	
	private Int lousa;
	
	private Boolean tablado;
	
	public Comum (Boolean ar, Int qtar, Int lousa, Boolean tablado){
		this.ar = ar;
		this.qtar = qtar;
		this.lousa = lousa;
		this.tablado = tablado;
	}
	void setAr (Boolean ar);{
		this.ar = ar;
	}
	void setQtar (Int qtar);{
		this.qtar = qtar;
	}
	void setLousa (Int lousa);{
		this.lousa = lousa;
	}
	void setTablado (Boolean tablado);{
		this.tablado = tablado;
	}
	Boolean getAr (Boolean ar);{
		return this.ar;
	}
	Int getQtar (Int qtar);{
		return this.qtar;
	}
	Int getLousa (Int lousa);{
		return this.lousa;
	}
	Boolean getTablado (Boolean tablado);{
		return this.tablado;
	}
	
}
