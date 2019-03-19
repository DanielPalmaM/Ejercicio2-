package javaBasic.tomaDeDecisiones;

public class IF_ELSE {

	public static void main(String[] args) {
	     int number = 10;
		 
	      if (number > 0) {
	         System.out.println("El Numero es positive.");
	      }
	      else if(number==0){
	         System.out.println("El Numero es is cero.");
	      }
	      else if(number<0){
		         System.out.println("El Numero es negative.");
		      }
	      //Nunca va a llegar a esta opcion dado a que entra a la primera validación 
	      else if(number==10){
		         System.out.println("el numero es igual a 10");
		      }
	      else {	 
	      System.out.println("El valor no conside con ningun filtro");
	      }
	   
		     String nombre = "andres";
			 
		      if (nombre.equals("andres")) {
		         System.out.println("el valor es igual a andres");
		      }
		      else if(nombre.equals("patricia")){
		         System.out.println("el valor es igual a patricia");
		      }
		      if (nombre.contains("and"))
		      {
		    	  System.out.println("el valor contiene el valor and");
		      }
		      else {	 
		      System.out.println("El valor no conside con ningun filtro");
		      }
	
	}

	}


