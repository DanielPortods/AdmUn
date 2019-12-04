package estfis;

public class Campus extends Estrutura {
private String cidade;
String nomeInst;

public Campus (String cid,String nome) {
	this.cidade = cid;
	this.nomeInst = nome;
}
    private String getCidade() {
	return cidade;
}
private void setCidade(String cidade) {
	this.cidade = cidade;
}
private String getNomeInst() {
	return nomeInst;
}
private void setNomeInst(String nomeInst) {
	this.nomeInst = nomeInst;
}
		

}
