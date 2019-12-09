package excecoes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;

public class LogGeralException extends Exception {
	
	private static final long serialVersionUID = 1L;	
	private PrintWriter out;
	
	public void msg() throws IOException{
		try {
			out = new PrintWriter(new FileWriter("Erros.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void close() {
		if (out != null) {
                        out.flush();
			out.close();
		}
	}
}