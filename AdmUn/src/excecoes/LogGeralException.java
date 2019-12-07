package excecoes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LogGeralException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public void msg () throws IOException {
		
	LogGeralException erros = new LogGeralException();
	ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("logErros.txt")));
	o.writeObject(erros);
	o.close();
	
	}
}
