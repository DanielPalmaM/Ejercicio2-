package javaBasic.variables;

public class PrimitivosExample {

	public static void main(String[] args) {
		int precio;
		boolean funciona;
		boolean esVisible;
		float diametro;
		short edad;
		long masa;
		char letra1;
		double peso;
		precio = 42; // Entero tipo int. Un número sin punto decimal se interpreta normalmente como
						// int.
		funciona = true; // Tipo boolean
		esVisible = false; // Tipo boolean
		diametro = 34.25f; // Tipo float. Una f o F final indica que es float.
		peso = 88.77; // Tipo double. Un número con punto decimal se interpreta normalmente como
						// double.
		edad = 19; // Entero tipo short
		masa = 178823411L; // Entero tipo long. Una l o L final indica que es long.
		letra1 = 'h'; // Tipo char (carácter). Se escribe entre comillas simples.
		System.out.println("Esto es un int " + precio);
		System.out.println("Esto es un boolean " + funciona);
		System.out.println("Esto es un boolean " + esVisible);
		System.out.println("Esto es un float " + diametro);
		System.out.println("Esto es un double " + peso);
		System.out.println("Esto es un short " + edad);
		System.out.println("Esto es un long " + masa);
		System.out.println("Esto es un char " + letra1);
	}

}
