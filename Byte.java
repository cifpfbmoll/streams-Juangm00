import java.io.FileInputStream;
import java.io.IOException;

public class Byte {{
	
	try (FileInputStream fin = new FileInputStream("texto.txt")) {
		public void lecturaByte() {
			int i;
			int contador = 0;
			do {
				i = fin.read();
				if (i != -1) {
					System.out.println((char) i);
				}
			}
			while (i != -1) {
				
			}
				
			
		}
	}
	catch (IOException exc) {
		System.out.println("Error al leer el archivo");
		System.out.println(exc.getMessage());
	}

}
}
