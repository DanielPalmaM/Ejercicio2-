package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;
import javaBasic.arregloObjetos.Persona;

public class ScannerExample {

	public static ArrayList<Persona> GenerarScanner(String saludo) {
		int a = 1;
		String continuar="";
		String detener= "n";
		Scanner in = new Scanner(System.in);
		ArrayList <Persona> arregloPersona = new ArrayList<Persona>();

    	    	
		do {  
//         Scanner scan = new Scanner(saludo);  
//         //Check if the scanner has a token  
//         System.out.println("Boolean Result: " + scan.hasNext());  
//         //Print the string  
//         System.out.println("String: " +scan.nextLine());  
//         scan.close();           
         System.out.println("--------Ingrese los datos del trabajador-------- ");  
         
         System.out.print("Enter your name: ");    
         String name = in.next();
         System.out.println("Name: " + name);
         System.out.print("Enter your apellido: ");    
         String apellido = in.next();
         System.out.println("Name: " + apellido);           
         System.out.print("Enter your age: ");  
         int age = in.nextInt();  
         System.out.println("Age: " + age);  
         System.out.print("Enter your salary: ");  
         int salary = in.nextInt();  
         System.out.println("Salary: " + salary);
         System.out.print("Desea continuar ingresado trabajador: s(si) o n(no)");
         continuar=in.next();
         arregloPersona.add(new Persona(name, apellido, age, salary));
         
         if (continuar.equalsIgnoreCase("s")){
         System.out.println("La respuesta es: "+continuar+ " puede continuar ingresando trabajador");
         }else { 
         System.out.println("La respuesta es: "+continuar+ " ha terminado de ingresar trabajador");
         }
         
		}while(!detener.equals(continuar));
        
		in.close();
		System.out.println("El largo del arreglo es: "+arregloPersona.size());
		return arregloPersona;
	}
}
