
/**
 * Codificar un programa que añada a un fichero al contenido de otro.
Ej.- $java FilePon f1.txt f2.txt
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
	// instance variables - replace the example below with your own
	public static void main(String argv[]) {
		// Abro le fichero de texto
		// Tambien puede recibir el nombre del fichero como parametro
		if (argv.length != 2) {
			System.out.println(" Error faltan parámetros." + "\n Uso CopiarTex <Fichero Origen> <Fichero Destino>");
			System.exit(1);
		}

		File fichero = new File(argv[0]);
		if (!fichero.exists() || !fichero.canRead()) {
			System.out.println(" No existe o no se puede leer el fichero " + argv[0]);
			System.exit(1);
		}

		Scanner scf = null;
		PrintWriter pw = null;
		try {
			scf = new Scanner(fichero);
			// Opcion de AÑADIR *******************
			pw = new PrintWriter(new FileWriter(argv[1], true));

			while (scf.hasNextLine()) {
				pw.println(scf.nextLine());
			}

		} catch (IOException ex) {
			System.out.println(" Error en Entrada  y Salida " + ex);
		} finally {
			// Cierra los ficheros si se han podido crear
			if (scf != null)
				scf.close();
			if (pw != null)
				pw.close();
		}
	}
}
