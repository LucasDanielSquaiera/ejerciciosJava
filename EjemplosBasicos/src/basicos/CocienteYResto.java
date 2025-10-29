package basicos;

import java.util.Scanner;

public class CocienteYResto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, indique un número entero");
		
		int a = entrada.nextInt();
		
		System.out.println("Ahora, ingrese otro para dividir el primero");
		
		int b = entrada.nextInt();
		
		int division = (a/b);
		int resto = a % b;
		
		System.out.println("El resultado de la divisón es: " + division + " y el resto es: " + resto);
		
		entrada.close();
		
	}

}
