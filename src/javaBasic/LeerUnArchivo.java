package javaBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeerUnArchivo {

   public static void BuscarTrabajador(String rutaArchivoLectura, String palabraBusqueda) throws IOException {
		 InputStream is = null;
		   int i;
		   char c;
		   String str = "";
           StringBuilder sb = new StringBuilder();

		   boolean encuentraPersona;
		   
        try {
        // new input stream created
        is = new FileInputStream(rutaArchivoLectura);
        
        System.out.println("Characters printed:");
        
        // reads till the end of the stream
        while((i = is.read())!=-1) {
        
           // converts integer to character
           c = (char)i;
           
           // prints character
//           System.out.print(c);
;
           
           if (c != '\r'){ 
        	   sb.append(c);
               str = sb.toString();  
        	   
           }else {        	
        	   if (str.equalsIgnoreCase(palabraBusqueda)) {
        		   System.out.println("Ha coincido la palabra buscada: "+str);
        		   break;
        	   }else {
        	   System.out.println("No ha coincidido la palabra buscada: "+str+ " Debe coincidir con: "+palabraBusqueda); 
        	   }
        	   str = "";
            }
           
        }
        
     } catch(Exception e) {
        // if any I/O error occurs
        e.printStackTrace();
     } finally {
        // releases system resources associated with this stream
        if(is!=null)
           is.close();
     }
		//return encuentraPersona;
  }
}
