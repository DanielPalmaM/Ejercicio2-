package javaBasic.arregloObjetos;

import java.util.ArrayList;

public class exampleArrayObject {

	public static void main(String[] args) {
		CasaRefinada nuevacasa = new CasaRefinada("Casabonita",10,10);

		System.out.println(nuevacasa.altoPorAncho());
		
		if(nuevacasa.seconsideraGrande())
		{
			System.out.println("si");
		}else
		{
			System.out.println("no");
		}
			
		
		/*
		Casa arrayObjetos[] = new Casa[2];
		Casa nuevacasa = new Casa();
		nuevacasa.setNombre("Casabonita");
		nuevacasa.setAlto(2);
		nuevacasa.setAncho(10);
		arrayObjetos[0] = nuevacasa;
		Casa nuevacasa2 = new Casa();
		nuevacasa2.setNombre("Casafea");
		nuevacasa2.setAlto(30);
		nuevacasa2.setAncho(5);
		arrayObjetos[1] = nuevacasa2;

		for (int i = 0; i < arrayObjetos.length; i++) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Este es el Nombre de mi casa: " + arrayObjetos[i].getNombre());
			System.out.println("Este es el Alto de mi casa: " + arrayObjetos[i].getAlto());
			System.out.println("Este es el Ancho de mi casa: " + arrayObjetos[i].getAncho());
			System.out.println("-----------------------------------------------------------------");
		}
		
		
		
		CasaRefinada arrayObjetosRefinado[] = new CasaRefinada[2];
		arrayObjetosRefinado[0]=new CasaRefinada("CasaEnorme", 40, 20);
		arrayObjetosRefinado[1]=new CasaRefinada("CasaFome",  12, 30);
		for (int i = 0; i < arrayObjetos.length; i++) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Este es el Nombre de mi casa: " + arrayObjetosRefinado[i].getNombre());
			System.out.println("Este es el Alto de mi casa: " + arrayObjetosRefinado[i].getAlto());
			System.out.println("Este es el Ancho de mi casa: " + arrayObjetosRefinado[i].getAncho());
			System.out.println("-----------------------------------------------------------------");
		}
*/
	}

}
