import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean Salir = false;
		while (Salir  = false) {
			System.out.println(" __________________________________________");
			System.out.println("|			CARTELERA CineFBMOLL		   |");
			System.out.println("|__________________________________________|");
			System.out.println("| 1. Byte a Byte                           |");
			System.out.println("| 2. Char a Char                           |");
			System.out.println("| 3. Buffer                                |");
			System.out.println("| 4. Salir                                 |");
			System.out.println("|__________________________________________|");
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				boolean SalirMenuB = false;
				while (SalirMenuB = false) {
					System.out.println(" __________________________________________");
					System.out.println("|			CARTELERA CineFBMOLL		   |");
					System.out.println("|__________________________________________|");
					System.out.println("| 1. Leer Cartelera                        |");
					System.out.println("| 2. Escribir Película                     |");
					System.out.println("| 3. Salir                                 |");
					System.out.println("|__________________________________________|");
					int opcionB = sc.nextInt();
					switch (opcionB) {
					case 1:
						lecturaByte();
						
					case 2:
						lecturaByte();
						
					case 3:
						SalirMenuB=true;
					}
					
				}
				break;
				
			case 2:
				boolean SalirMenuC = false;
				while (SalirMenuC = false) {
					System.out.println(" __________________________________________");
					System.out.println("|			CARTELERA CineFBMOLL		   |");
					System.out.println("|__________________________________________|");
					System.out.println("| 1. Leer Cartelera                        |");
					System.out.println("| 2. Escribir Película                     |");
					System.out.println("| 3. Salir                                 |");
					System.out.println("|__________________________________________|");
					Scanner scB = new Scanner(System.in);
					int opcionC = scB.nextInt();
					switch (opcionC) {
					case 1:
						lecturaChar();
					case 2:
						escrituraChar();
					case 3:
						SalirMenuB=true;
				break;
				
			case 3:
				boolean SalirMenuBF = false;
				while (SalirMenuBF = false) {
					System.out.println(" __________________________________________");
					System.out.println("|			CARTELERA CineFBMOLL		   |");
					System.out.println("|__________________________________________|");
					System.out.println("| 1. Leer Cartelera                        |");
					System.out.println("| 2. Escribir Película                     |");
					System.out.println("| 3. Salir                                 |");
					System.out.println("|__________________________________________|");
					Scanner scBF = new Scanner(System.in);
					int opcionBF = scBF.nextInt();
					switch (opcionBF) {
					case 1:
						lecturaBuffer();
					case 2:
						escrituraBuffer();
					case 3:
						SalirMenuBF = true;
					}
				}
				
				break;
			case 4:
				Salir = true;
			
			}
			
		}
	}
		}
	}
}


