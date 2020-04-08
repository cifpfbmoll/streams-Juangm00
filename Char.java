import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Char {
	public static void lecturaChar() throws IOException{
		int contador = 0;
		File entrada = new File("texto.txt");
		FileReader lector = new FileReader(entrada);
		int unCaracter;
		while ((unCaracter= lector.read()) != -1) {
			char letra =(char) unCaracter;
			if (letra == '#') {
				System.out.println("\n");
				contador += 1;
			}
			if (letra == '{') {
				System.out.println((char) unCaracter);
				System.out.println("\n");
				contador = 0;
			
			}
		}
		lector.close();
	}
}
