package javaBasic;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javaBasic.arregloObjetos.Persona;


public class EscribeFichero
{
    
    public static void GenerarFichero(String rutaFichero, ArrayList<Persona> textoImprimir) {
    	FileWriter fichero = null;
        PrintWriter pw = null;
        
    	try
        {
            fichero = new FileWriter(rutaFichero);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < textoImprimir.size(); i++) {
                pw.println(textoImprimir.get(i).getNombre());
            	pw.println(textoImprimir.get(i).getApellido());
            	pw.println(textoImprimir.get(i).getEdad());
            	pw.println(textoImprimir.get(i).getSalario());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    	
    	
    }
}
