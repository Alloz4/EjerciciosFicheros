/*
 * Realizar un comando en java para visualizar ficheros de texto que me permita mostrar el fichero pantalla a pantalla (24 líneas consecutivas), realizando una espera después de cada pantalla hasta que el usuario pulse Intro, para mostrar la siguiente página del fichero.
 */
import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File archivo = new File("C:/Users/34670/Desktop/JAVA eclipse/Ficheros-ejercicios/Ficheros/fichero.txt");
		
		Scanner sc = new Scanner(archivo);
		Scanner salto = new Scanner(System.in);
		
		String linea;
		String intro;
		int contador = 0;
		while (sc.hasNext()) {
			linea = sc.nextLine() ;
			System.out.print(linea);
			intro = salto.nextLine();
			if (contador == 23) {
				break;
			}
			contador++;
		}
		
	}

}
