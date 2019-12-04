package estfis;

public class Auditorio extends Sala {
	private Boolean ar;
	
	private Int qtar;
	
	private Int lousa;
	
	public Auditorio (Boolean ar, Int qtar, Int lousa){
		this.ar = ar;
		this.qtar = qtar;
		this.lousa = lousa;
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
	Boolean getAr (Boolean ar);{
		return this.ar;
	}
	Int getQtar (Int qtar);{
		return this.qtar;
	}
	Int getLousa (Int lousa);{
		return this.lousa;
	}
}
