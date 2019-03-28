package Ejecutables;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javaBasic.Mantenedores;
import javaBasic.PadreScanear;
import javaBasic.ScannerExample;
import javaBasic.arregloObjetos.Persona;

public class Ejecutable2 {//extends PadreScanear {

	public static void main(String[] args) throws IOException {
		PadreScanear ps = new PadreScanear();
		Scanner scanMantenedor  =ps.Scaner();
    	String saludo = "Hola. Favor ingresar nueva persona";
    	
    	ArrayList <Persona> ArregloPersonas = new ArrayList<Persona>(); 
		
		ArregloPersonas= ScannerExample.GenerarScanner(saludo, scanMantenedor);
		Mantenedores.mantenedor(ArregloPersonas, scanMantenedor);
	
		
	}

}
