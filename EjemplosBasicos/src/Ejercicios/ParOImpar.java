package Ejercicios;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		int num;
		System.out.println("Por favor, dime un número");
		num = escaner.nextInt();
		
		escaner.close();
		
		if (num % 2 == 0) {
			System.out.println("El número: " + num + " es par");
		} else{
			System.out.println("El número: " + num + " es impar");
		}

	}

}
