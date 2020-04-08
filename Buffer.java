import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
	

	public class Lector {
		public void lecturaBuffer() throws IOException{
			File entrada = new File("texto.txt");
			FileReader lector = new FileReader(entrada);
			int unCaracter;
			while ((unCaracter = lector.read(entrada) != -1)) {
				System.out.println((char) unCaracter);
				if (unCaracter == '#') {
					
				}
			}
			lector.close();
		}
	}

}
