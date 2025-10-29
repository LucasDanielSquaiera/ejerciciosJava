package basicos;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		int a;
		int b; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor introduce un número.");
		
		a = entrada.nextInt();
		
		System.out.println("Por favor, ahora introduce otro número.");
		
		b = entrada.nextInt();
		
		System.out.println("La suma de "+a +" más "+ b + " es: "+ (a + b));
		System.out.println("La resta de " + a + " más " + b + " es: " + (a - b));
		System.out.println("La multiplicación de " + a + " por " + b + " es: " + (a * b));
		
		
		entrada.close();
		//versión 2: utilizando variables para almacenar el resultado
		int resultadoSuma = (a + b);
		int resultadoResta = (a - b);
		int resultadoMultiplicacion = (a * b); 
		
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("El resultado de la resta es: " + resultadoResta);
		System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
		
	}

}
