package basicos;

import java.util.Scanner;
import java.lang.Math;

public class Catetos {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, indica dos catetos de un triángulo.");
		
		double cateto1 = entrada.nextDouble();
		

		double cateto2 = entrada.nextDouble();
		
		double hipotenusa = Math.sqrt((Math.pow(cateto1,2) + (Math.pow(cateto2,2))));
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		
		entrada.close();

	}

}
