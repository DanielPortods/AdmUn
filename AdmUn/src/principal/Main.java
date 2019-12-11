package principal;
import gui.Arq;
import gui.Menus;
import estfis.Instituicao;
import excecoes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;

public class Main {
	private static ArrayList<Instituicao> inst = new ArrayList<>();

	public static void main(String[] args) throws OpcaoInvalidaException, NumberFormatException, CampoEmBrancoException, DisciplinaNaoInformadaException, ProfessorNaoAtribuidoException, TipoDeAulaNaoAtribuidoException, IOException{
		File log = new File("log.txt");
		try{
		    if( log.exists() ){
		    	log.delete();
		    	log.createNewFile();
		    }else {
		    	log.createNewFile();
		    }
		}catch(IOException ex){
		    ex.printStackTrace();
		}
		
		while (true) {
			try {
				Menus.enter();
				String res = Menus.entrada();
				if (res.equals("1")) {
					while (true) {
						try {
							Menus.menu("Instituições", inst, "AdmUn");
							String res2 = Menus.entrada();

							if (res2.equals("<")) {
								break;
							} else if (res2.equals("+")) {
								ArrayList<String> pal = new ArrayList<>();
								pal.add("Nome");
								pal.add("UF");
								inst.add((Instituicao)Menus.caNew(2, pal, "I"));
							} else if (res2.equals("-")) {
								Menus.del(inst, "Instituição");
							} else {
								int id = Integer.parseInt(res2);
								inst.get(id - 1).home(inst.get(id-1).getEst());
							}
						}catch (NumberFormatException e) {
							Arq.escreva(e.fillInStackTrace().toString() + "\n");
							JOptionPane.showMessageDialog(null, "Informe a posição na lista de instituições ");
							continue;
						}catch (IndexOutOfBoundsException e) {
							Arq.escreva(e.fillInStackTrace().toString() + "\n");
							JOptionPane.showMessageDialog(null, "Instituição inexistente!");
							continue;
						}
					}
				} else if (res.equals("2")) {
					break;
				} else {
					throw new OpcaoInvalidaException(0, 1);
				}
			} catch (OpcaoInvalidaException e) {
				e.msg();
				continue;
			} 
		}	
	}
	
	public static ArrayList<Instituicao> getInst () {
		return Main.inst;
	}
}