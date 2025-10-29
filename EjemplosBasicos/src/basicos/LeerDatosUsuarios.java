package basicos;

import java.util.Scanner;
public class LeerDatosUsuarios {

	public static void main(String[] args) {
	
		//Creamos el scanner = Leer en Pseint
		Scanner entrada = new Scanner(System.in);	
	System.out.print("Introduce tu nombre:"); //escribir
	//Leemos el nombre
	String nombre = entrada.nextLine();
	System.out.print("Introduce tu edad:");
	int edad = entrada.nextInt(); //next int entero, next line string
	System.out.println("Hola " + nombre + ", tienes " + edad + " años");
	entrada.close(); // cerramos scanner
	}

}
