package estfis;

public class Lab extends Sala{
	private Int qtar;
	
	private Int cpu;
	
	private Int lousa;
	
	public Lab (Int qtar, Int cpu, Int lousa){
		this.qtar = qtar;
		this.cpu = cpu;
		this.lousa = lousa;
	}
	void setQtar (Int qtar);{
		this.qtar = qtar;
	}
	void setCpu (Int cpu);{
		this.cpu = cpu;
	}
	void setLousa (Int lousa);{
		this.lousa = lousa;
	}
	Int getQtar (Int qtar);{
		return this.qtar;
	}
	Int getCpu (Int cpu);{
		return this.cpu;
	}
	Int getLousa (Int lousa);{
		return this.lousa;
	}
}
