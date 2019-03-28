package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;
import javaBasic.arregloObjetos.Persona;

public class ScannerExample {

	public static ArrayList<Persona> GenerarScanner(String saludo, Scanner scanMantenedor) {
		int a = 1;
		String continuar="";
		String detener= "n";
		ArrayList <Persona> arregloPersona = new ArrayList<Persona>();

    	    	
		do {  
       
         System.out.println("--------Ingrese los datos del trabajador-------- ");  
         
         System.out.print("Enter your name: ");    
         String nombre = scanMantenedor.next();
         System.out.println("Name: " + nombre);
         System.out.print("Enter your apellido: ");    
         String apellido = scanMantenedor.next();
         System.out.println("Name: " + apellido);           
         System.out.print("Enter your age: ");  
         int edad = scanMantenedor.nextInt();  
         System.out.println("Age: " + edad);  
         System.out.print("Enter your salary: ");  
         int salario = scanMantenedor.nextInt();  
         System.out.println("Salary: " + salario);
         System.out.print("Desea continuar ingresado trabajador: s(si) o n(no)");
         continuar=scanMantenedor.next();
         arregloPersona.add(new Persona(nombre, apellido, edad, salario));
         
         if (continuar.equalsIgnoreCase("s")){
         System.out.println("La respuesta es: "+continuar+ " puede continuar ingresando trabajador");
         }else { 
         System.out.println("La respuesta es: "+continuar+ " ha terminado de ingresar trabajador");
         }
         
		}while(!detener.equals(continuar));
        
		System.out.println("El largo del arreglo es: "+arregloPersona.size());
		return arregloPersona;
	}
}
