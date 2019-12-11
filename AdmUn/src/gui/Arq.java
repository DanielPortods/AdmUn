package gui;

import java.io.FileWriter;
import java.io.IOException;

public class Arq {
	public static void escreva(String s) throws IOException {
		try {
			FileWriter wr = new FileWriter("log.txt", true);
			wr.append(s);
			wr.close();
		}catch(IOException e) {
			System.exit(0);
		}
	}
}
