package javaBasic.tomaDeDecisiones;

import java.io.IOException;

public class SwitchExample {
	
	public static void main(String[] args) throws IOException {
		String opc = "1";		
		SwitchExample swit = new SwitchExample();
		swit.opcion(opc);
		
	}
	
	public void opcion(String opc) {
		switch(opc){
		case "1":
			System.out.println("Seleccionaste la opción 1");
			break;
		case "2":
			System.out.println("Seleccionaste la opción 2");
			break;
		case "3":
			System.out.println("Seleccionaste la opción 3");
			break;
		}
	}
}

