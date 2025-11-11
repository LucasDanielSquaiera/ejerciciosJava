package Ejercicios;

import java.util.Scanner;

public class SioNo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String opcion;
		
		do {
			System.out.println("¿Quieres continuar? (s/n)");
			  
			 opcion = leer.next();
			
		} while((!opcion.equals("S")) || (!opcion.equals( "s"))  || (!opcion.equals("n"))  || (!opcion.equals("N")));
		
		

		
		
		
		
		
		
		leer.close();
	}

}
