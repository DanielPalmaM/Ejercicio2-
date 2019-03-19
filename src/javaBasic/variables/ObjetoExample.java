package javaBasic.variables;

import java.util.ArrayList;

import javaBasic.arregloObjetos.Casa;

public class ObjetoExample {
	public static void main(String[] args) {
		String srf = new String();

		srf = "srf1234";
		String aula;
		aula = "A-44"; // Tipo String
		System.out.println("Esto es un String aula " + aula);
		System.out.println("Esto es un String srf " + srf);

		Casa nuevacasa = new Casa();
		nuevacasa.setNombre("Casabonita");
		nuevacasa.setAlto(2);
		nuevacasa.setAncho(10);
		System.out.println("Nombre: " + nuevacasa.getNombre() + " Alto: " + nuevacasa.getAlto() + " Ancho: "
				+ nuevacasa.getAncho());

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("andrés");
		nombres.add("patricio");
		System.out.println(nombres.get(0));
		System.out.println(nombres.get(1));

		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}

		char[] hola = new char[4];
		hola[0] = 'h';
		hola[1] = 'o';
		hola[2] = 'l';
		hola[3] = 'a';
		System.out.println(hola);
		String shola = new String(hola);
		System.out.println(shola);
		int[] nume = new int[4];
		nume[0] = 1;
		nume[1] = 2;
		nume[2] = 3;
		nume[3] = 4;
		
		System.out.println("imprimo el numero 1 = "+nume[0]);
		System.out.println("imprimo el numero 2 = "+nume[1]);
		System.out.println("imprimo el numero el largo total del arreglo "+nume.length);
		
		/*
		int contador = 0;
		do {
			System.out.println("imprimo el numero "+nume[contador]);
			contador++;
		} while (contador<nume.length);
		*/

	}
}
