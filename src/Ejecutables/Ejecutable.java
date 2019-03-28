package Ejecutables;

import java.io.IOException;
import java.util.ArrayList;

import javaBasic.EscribeFichero;
import javaBasic.LeerUnArchivo;
import javaBasic.arregloObjetos.Persona;

public class Ejecutable {

	public static void main(String[] args) throws IOException {
		
    	String saludo = "Hello, This is JavaTpoint.";
    	String escribirArchivo="./texto.txt";
    	String leerArchivo="./texto.txt";
    	
    	ArrayList <Persona> ArregloPersonas = new ArrayList(); 
		
//		ArregloPersonas= ScannerExample.GenerarScanner(saludo);
		EscribeFichero.GenerarFichero(escribirArchivo, ArregloPersonas);
		LeerUnArchivo.BuscarTrabajador(leerArchivo, "Daniel");
		
	}

}
