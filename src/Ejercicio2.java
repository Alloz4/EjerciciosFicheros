/*
 * Realizar un comando que muestre un fichero de texto con sus líneas invertidas.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File archivo = new File("C:/Users/34670/Desktop/JAVA eclipse/Ficheros-ejercicios/Ficheros/ejercicio2.txt");
		
		Scanner sc = new Scanner(archivo);
		
		String linea = null;

		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			String alreves = "";
			
			for(int i = linea.length() - 1; i >= 0; i--) {
				alreves += linea.charAt(i) ;
			}
			System.out.println(alreves);
		}		
		sc.close();
	}

}
