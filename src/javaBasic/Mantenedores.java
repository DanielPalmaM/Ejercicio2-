package javaBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javaBasic.arregloObjetos.Persona;
import javaBasic.tomaDeDecisiones.SwitchExample;
public class Mantenedores {
		
	public static void mantenedor(ArrayList<Persona> nPersona, Scanner scanMantenedor) throws IOException {
		String opc="";
		
		// Bienvenida al mantendor a través del scanner
		System.out.println();
		Scanner scan3 = new Scanner("BIENVENIDOS AL MANTENEDOR DE ARREGLO");  
        //Print the string  
        System.out.println("::::::::::::::::: " +scan3.nextLine()+ " :::::::::::::::::");  
        scan3.close(); 
        
		
		do {
		
		System.out.println("Ingrese alguna opción del Mantenedor: 1-Insertar; 2-Modificar; 3-Eliminar; 4-Salir");       
        scanMantenedor.hasNext();
        opc = scanMantenedor.next();
       		
		SwitchExample swit = new SwitchExample();
		swit.opcion(opc);
			
		switch(opc){
		case "1":
			System.out.println("Ingresar una Nueva Persona");			
			IngresarPersona(scanMantenedor, nPersona);
			
			break;
		case "2":
			System.out.println("Actualizar un nombre de usuario");
		
			System.out.println("---------------- Ingrese Nombre de la Persona que desea Modificar ----------------");  
         	System.out.println("NOMBRE: " +scanMantenedor.nextLine());
	        String aPalabra = scanMantenedor.next();
			
			System.out.println("--------Ingrese Nuevo Nombre-------- ");
			System.out.println("NOMBRE NUEVO: " +scanMantenedor.nextLine());
			String nPalabra = scanMantenedor.next();
			
			SeleccionarNombre(aPalabra, nPersona, nPalabra);
			
			break;
		case "3":
			System.out.println("Borrar un usuario");
		
			System.out.println("---------------- Ingrese Nombre de la Persona que desea Eliminar ----------------");  
         	System.out.println("NOMBRE: " +scanMantenedor.nextLine());
	        String bPalabra = scanMantenedor.next();
						
			EliminarPersona(bPalabra, nPersona);
			
			break;
			
		case "4":
			opc="0";
			System.out.println("Ha seleccionado la opcion 4 - Salir del Mantenedor");
		}	
		
		} while(!opc.equalsIgnoreCase("0"));
			
					
	}
	
	public static void IngresarPersona(Scanner sCAN2, ArrayList<Persona> NPersona) {
		   String continuar="";
		   String detener= "n";
				
		   		do {        
			         System.out.println("---------------- Ingrese los datos de la Persona ----------------");  
			         
			         System.out.println(sCAN2.nextLine());
			         
			         System.out.print("Enter your name: ");    
			         String name = sCAN2.next();
			         System.out.println("Name: " + name);
			         System.out.print("Enter your apellido: ");    
			         String apellido = sCAN2.next();
			         System.out.println("Name: " + apellido);           
			         System.out.print("Enter your age: ");  
			         int age = sCAN2.nextInt();  
			         System.out.println("Age: " + age);  
			         System.out.print("Enter your salary: ");  
			         int salary = sCAN2.nextInt();  
			         System.out.println("Salary: " + salary);
			         System.out.print("Desea continuar ingresado trabajador: s(si) o n(no)");
			         continuar=sCAN2.next();
			         NPersona.add(new Persona(name, apellido, age, salary));
			         
			         if (continuar.equalsIgnoreCase("s")){
			         System.out.println("La respuesta es: "+continuar+ " puede continuar ingresando trabajador");
			         }else { 
			         System.out.println("La respuesta es: "+continuar+ " ha terminado de ingresar trabajador");
			         }
			         
				}while(!detener.equals(continuar));
					
				System.out.println("El largo del arreglo es: "+NPersona.size());
					
		   }
		   
		   
		   public static void SeleccionarNombre(String palabraBusqueda, ArrayList<Persona> NPersona, String nPalabra) throws IOException {
				   
		      try {
		    	  for (int j = 0; j < NPersona.size(); j++) {
		    		  
		    		 if (NPersona.get(j).getNombre().equalsIgnoreCase(palabraBusqueda)) {
		    			System.out.println("La palabra buscada ha coincidido: "+palabraBusqueda);
		    			NPersona.get(j).setNombre(nPalabra);
		    		 }
		    	  }
		      
		      
		      } catch(Exception e) {
		    	  // if any I/O error occurs
		    	  e.printStackTrace();
		      
				//return encuentraPersona;
		      }
		      System.out.println("El largo del arreglo es: "+NPersona.size());
		      for (int j = 0; j < NPersona.size(); j++) {
				  
		 		 System.out.println(NPersona.get(j).getNombre());
		 		 System.out.println(NPersona.get(j).getApellido());
		 		 System.out.println(NPersona.get(j).getEdad());
		 		 System.out.println(NPersona.get(j).getSalario());
		 		
		 		}
		 	  }
		   
		   		
		   public static void EliminarPersona(String palabraBusqueda, ArrayList<Persona> NPersona) throws IOException {
			   
			      try {
			    	  for (int j = 0; j < NPersona.size(); j++) {
			    		  
			    		 if (NPersona.get(j).getNombre().equalsIgnoreCase(palabraBusqueda)) {
			    			NPersona.remove(j);
			    			System.out.println("Se ha eliminado la Persona: "+palabraBusqueda);
			    		 }
			    	  }
			      
			      
			      } catch(Exception e) {
			    	  // if any I/O error occurs
			    	  e.printStackTrace();
			      
					//return encuentraPersona;
			      }
			      System.out.println("La cantidad de personas son: "+NPersona.size());
			      for (int j = 0; j < NPersona.size(); j++) {
					  
			 		 System.out.println(NPersona.get(j).getNombre());
			 		 System.out.println(NPersona.get(j).getApellido());
			 		 System.out.println(NPersona.get(j).getEdad());
			 		 System.out.println(NPersona.get(j).getSalario());
			 		
			 		}
		   }
}
