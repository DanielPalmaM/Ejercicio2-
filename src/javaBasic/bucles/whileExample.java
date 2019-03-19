package javaBasic.bucles;

public class whileExample {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 5) {
			System.out.println("Estoy repitiendo esto " + i);
			i++;
		}

		i = 1;
		while (true) {
			System.out.println("Estoy repitiendo esto " + i);
			if (i == 5) {
				System.out.println("Stop");
				break;
			}
			i++;
		}

		while (i <= 1000) {
			System.out.println("Estoy repitiendo esto " + i);			
			if (i <= 5) {
				i++;
				continue;					
			}
			System.out.println("Stop");
			break;
		}

	}
}
