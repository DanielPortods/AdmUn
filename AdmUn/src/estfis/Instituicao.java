package estfis;

public class Instituicao extends Estrutura {
		private String uf;
		Campus cp[];
		
		public Instituicao (String nom, String uf) {
			this.nome = nom;
			this.uf = uf;
			this.formest = "Campus";
		}
}
