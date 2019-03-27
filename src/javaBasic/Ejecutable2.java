package javaBasic;

import java.io.IOException;
import java.util.ArrayList;
import javaBasic.arregloObjetos.Persona;

public class Ejecutable2 {

	public static void main(String[] args) throws IOException {
		
    	String saludo = "Hola. Favor ingresar nueva persona";
    	String escribirArchivo="./texto.txt";
    	String leerArchivo="./texto.txt";
    	
    	ArrayList <Persona> ArregloPersonas = new ArrayList<Persona>(); 
		
		ArregloPersonas= ScannerExample.GenerarScanner(saludo);
		Mantenedores.mantenedor(ArregloPersonas);//, persona, opcion);

		LeerUnArchivo.BuscarTrabajador(leerArchivo, "Daniel");
		
	}

}
