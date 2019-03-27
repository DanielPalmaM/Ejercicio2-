package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;
import javaBasic.arregloObjetos.Persona;
import javaBasic.tomaDeDecisiones.SwitchExample;
public class Mantenedores {
		
	public static void mantenedor(ArrayList<Persona> nPersona) {//, Persona persona, String opcion ) {
		String opc = "";//opcion;
		String continuar="";
		String detener= "n";
		
		Scanner in2 = new Scanner(System.in);
		
		Scanner scan3 = new Scanner("Bienvenidos al Mantenedor de Arreglo");  
        //Check if the scanner has a token  
        System.out.println("Boolean Result: " + scan3.hasNext());  
        //Print the string  
        System.out.println("String: " +scan3.nextLine());  
        scan3.close(); 
        
        System.out.println("Ingrese alguna opción: 1-Insertar; 2-Modificar; 3-Eliminar");
		
        opc = in2.next();
       		
		SwitchExample swit = new SwitchExample();
		swit.opcion(opc);
		
		
		switch(opc){
		case "1":
			    	    	
			do {  
	         Scanner scan2 = new Scanner("Insertar Nueva Persona");  
	         //Check if the scanner has a token  
	         System.out.println("Boolean Result: " + scan2.hasNext());  
	         //Print the string  
	         System.out.println("String: " +scan2.nextLine());  
	         scan2.close();           
	         System.out.println("--------Ingrese los datos del trabajador-------- ");  
	         
	         System.out.println("String: " +in2.nextLine());
	         
	         System.out.print("Enter your name: ");    
	         String name = in2.next();
	         System.out.println("Name: " + name);
	         System.out.print("Enter your apellido: ");    
	         String apellido = in2.next();
	         System.out.println("Name: " + apellido);           
	         System.out.print("Enter your age: ");  
	         int age = in2.nextInt();  
	         System.out.println("Age: " + age);  
	         System.out.print("Enter your salary: ");  
	         int salary = in2.nextInt();  
	         System.out.println("Salary: " + salary);
	         System.out.print("Desea continuar ingresado trabajador: s(si) o n(no)");
	         continuar=in2.next();
	         nPersona.add(new Persona(name, apellido, age, salary));
	         
	         if (continuar.equalsIgnoreCase("s")){
	         System.out.println("La respuesta es: "+continuar+ " puede continuar ingresando trabajador");
	         }else { 
	         System.out.println("La respuesta es: "+continuar+ " ha terminado de ingresar trabajador");
	         }
	         
			}while(!detener.equals(continuar));
			
			in2.close();
			System.out.println("El largo del arreglo es: "+nPersona.size());
			
			break;
		case "2":
			System.out.println("Seleccionaste la opción 2 - Actualizar un nombre de usuario");
			break;
		case "3":
			System.out.println("Seleccionaste la opción 3 - Borrar un usuario");
			break;
		
		}
	}
}
